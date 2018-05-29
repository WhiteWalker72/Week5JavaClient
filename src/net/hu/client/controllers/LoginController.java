package net.hu.client.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class LoginController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private Label passText;

    public LoginController() {

    }

    public void initialize() {
        //TODO: login button action
        loginBtn.setOnAction(event -> {

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
