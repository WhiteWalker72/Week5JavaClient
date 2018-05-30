package net.hu.client.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import soap.product.ArrayOfProduct;
import soap.product.IProductService;
import soap.product.Product;
import soap.product.ProductService;
import soap.user.ArrayOfProductItem;
import soap.user.IUserService;
import soap.user.ProductItem;
import soap.user.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StoreController {

    @FXML
    private ListView invList;

    @FXML
    private ListView productsList;

    @FXML
    private Label moneyLabel;

    @FXML
    private Button buyBtn;

    @FXML
    private Button refreshBtn;

    private final String username;
    private final IProductService productService;
    private final IUserService userService;

    private List<Product> products = new ArrayList<>();

    public StoreController(String username) {
        this.username = username;
        productService = new ProductService().getBasicHttpBindingIProductService();
        userService = new UserService().getBasicHttpBindingIUserService();
    }

    public void initialize() {
        refreshScreen();

        refreshBtn.setOnAction(event -> refreshScreen());

        buyBtn.setOnAction(event -> {
            int index = productsList.getSelectionModel().getSelectedIndex();
            if (index >= 0) {
                Product product = products.get(index);
                if (product != null) {
                    String productName = product.getName().getValue();
                    boolean bought = productService.buyProduct(productName, username);

                    if (bought) {
                        userService.addProduct(username, productName);
                        refreshScreen();
                    }
                }
            }
        });
    }

    private void refreshScreen() {
        moneyLabel.setText(userService.getMoney(username).toString());

        products = productService.getAllProducts().getProduct();
        ObservableList<String> productObList = FXCollections.observableArrayList();

        productObList.addAll(
                products.stream().map(product -> product.getName().getValue() + " €" + product.getPrice().toString() + " "
                + "(" + product.getAmountInStock().toString() + ")").collect(Collectors.toList())
        );
        productsList.setItems(productObList);

        List<ProductItem> invItems = userService.getProductItems(username).getProductItem();
        ObservableList<String> invObList = FXCollections.observableArrayList();

        invObList.addAll(
                invItems.stream().map(productItem -> productItem.getProductName().getValue() + " (" + productItem.getAmount() + ")")
                        .collect(Collectors.toList())
        );
        invList.setItems(invObList);
    }

}
