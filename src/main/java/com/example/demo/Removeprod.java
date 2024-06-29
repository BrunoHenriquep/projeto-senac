package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Removeprod extends Application {
    @FXML
    private Label label;

    @FXML
    private TextField codBarras;

    @FXML
    private Button remover;

    @FXML
    private Hyperlink voltarCadastro;

    @FXML
    private ImageView imagprod;

    


    @FXML
    public void retornar()throws IOException {
        Stage stage = (Stage) voltarCadastro.getScene().getWindow();
        SceneSwitcher.switchScene(stage, "main-view.fxml");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


    }
}
