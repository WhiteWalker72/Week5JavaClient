package net.hu.client.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import soap.product.IProductService;
import soap.product.ProductService;
import soap.user.IUserService;
import soap.user.UserService;

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

    public StoreController(String username) {
        this.username = username;
        productService = new ProductService().getBasicHttpBindingIProductService();
        userService = new UserService().getBasicHttpBindingIUserService();
    }

    public void initialize() {

    }

    private void refreshScreen() {

    }

}
