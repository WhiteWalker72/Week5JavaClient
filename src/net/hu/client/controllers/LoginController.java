package net.hu.client.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.tempuri.ILoginService;
import org.tempuri.LoginService;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class LoginController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private TextField nameField;

    @FXML
    private TextField passField;

    @FXML
    private Label errorText;

    private final ILoginService loginService;

    public LoginController() {
        loginService = new LoginService().getBasicHttpBindingILoginService();
    }

    public void initialize() {
        //TODO: login button action
        loginBtn.setOnAction(event -> {
            String username = nameField.getText();
            String password = passField.getText();

            if (username.length() <= 0 || password.length() <= 0) {
                errorText.setText("Insert a username and password");
                return;
            }
            if (!loginService.authenticate(username, password)) {
                errorText.setText("Invalid username or password");
                return;
            }

            try {
                URL url = new File("src/net/hu/client/store.fxml").toURI().toURL();
                Parent root = FXMLLoader.load(url);
                Stage stage = new Stage();
                stage.setTitle("Store");
                stage.setScene(new Scene(root));

                Stage thisStage = (Stage) registerBtn.getScene().getWindow();
                thisStage.close();

                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

        registerBtn.setOnAction(event -> {
            try {
                URL url = new File("src/net/hu/client/register.fxml").toURI().toURL();
                Parent root = FXMLLoader.load(url);
                Stage stage = new Stage();
                stage.setTitle("Register");
                stage.setScene(new Scene(root));

                Stage thisStage = (Stage) registerBtn.getScene().getWindow();
                thisStage.close();

                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

}
