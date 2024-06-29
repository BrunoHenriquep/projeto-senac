package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class LoginController {
    @FXML
    private TextField email;
    @FXML
    private PasswordField senha;
    @FXML
    private Button logar;
    @FXML
    private Hyperlink cadastrar;

    @FXML
    private Button voltarTela;


    @FXML
    private void botaologar() throws IOException {
        String mail = email.getText();
        String pass = senha.getText();
        if (validarLogin(mail, pass) == true) {
            Stage stage = (Stage) email.getScene().getWindow();
            SceneSwitcher.switchScene(stage, "hello-view.fxml");
        } else {
            System.out.println("Login ou Senha incorreto");
        }
    }
    @FXML
    public void trocartela() throws IOException {
            Stage stage = (Stage) email.getScene().getWindow();
            SceneSwitcher.switchScene(stage, "hello-view.fxml");
        }

    @FXML
    public void voltar()throws IOException {
        Stage stage = (Stage) voltarTela.getScene().getWindow();
        SceneSwitcher.switchScene(stage, "main-view.fxml");

    }


    private boolean validarLogin(String mail, String pass) {
        String url = "jdbc:mysql://localhost:3308/app";
        String user = "root";
        String pwd = "";

        String query = "SELECT * FROM cadastro WHERE email = ? AND senha= ?";

        try (Connection connection = DriverManager.getConnection(url, user, pwd);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, pass);

            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @FXML
    private void mudarTela() throws IOException {
        Stage stage = (Stage) email.getScene().getWindow();
        SceneSwitcher.switchScene(stage, "hello-view.fxml");
      SceneSwitcher.switchScene(stage, "main-view.fxml");
    }
}


