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


public class RegisterController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private Label passText;

    public RegisterController() {

    }

    public void initialize() {
        //TODO register button action
        registerBtn.setOnAction(event -> {

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
