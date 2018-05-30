package net.hu.client.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import soap.register.IRegisterService;
import soap.register.RegisterService;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class RegisterController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private Label passText;

    @FXML
    private Label errorText;

    @FXML
    private TextField nameField;

    private final IRegisterService registerService;

    public RegisterController() {
        registerService = new RegisterService().getBasicHttpBindingIRegisterService();
    }

    public void initialize() {
        passText.setText(registerService.generatePassword());

        registerBtn.setOnAction(event -> {
            String username = nameField.getText();
            if (username.length() <= 0) {
                errorText.setText("Insert a username");
                return;
            }
            if (registerService.accountExists(username)) {
                errorText.setText("Invalid username");
                return;
            }
            String password = passText.getText();
            if (password == null || password.length() <= 0) {
                errorText.setText("Invalid password");
                return;
            }

            registerService.register(username, password);
            errorText.setText("User created!");
        });

        loginBtn.setOnAction(event -> {
            try {
                URL url = new File("src/net/hu/client/login.fxml").toURI().toURL();
                Parent root = FXMLLoader.load(url);
                Stage stage = new Stage();
                stage.setTitle("Login");
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
