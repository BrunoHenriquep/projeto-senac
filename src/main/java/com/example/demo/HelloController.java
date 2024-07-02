package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloController {
    @FXML
    private Label label;
    @FXML
    private TextField caminhodaimagem;

    @FXML
    private Label sucessocadastro;

    @FXML
    private TextField codBarras;

    @FXML
    private TextField preco;

    @FXML
    private TextField descricao;

    @FXML
    private Button voltarlogin;

    @FXML
    private Button cadastrar;

    @FXML
    private ImageView imagem;

    @FXML
    private Button insiraimagem;

    private Stage stage;

    @FXML
    private Button irRemovProd;

    private void limparTela(){
        caminhodaimagem.setText("");
        codBarras.setText("");
        preco.setText("");
        descricao.setText("");
        imagem.setImage(null);
    }
    @FXML
    public void IrRemovProd()throws IOException {
        Stage stage = (Stage) irRemovProd.getScene().getWindow();
        SceneSwitcher.switchScene(stage, "Removprod-view.fxml");
    }


    @FXML
    private void insertImage(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png" , "*.jpeg"));
        File file = fileChooser.showOpenDialog(stage);

        if(file != null){
            caminhodaimagem.setText(file.getAbsolutePath().replace("\\","/"));
            imagem.setImage(new Image("file:" + caminhodaimagem.getText()));
        }
    }

    @FXML
    private void botaoCadastro()throws IOException {
        String cod = codBarras.getText();
        String pre = preco.getText();
        String desc = descricao.getText();
        String ima = caminhodaimagem.getText();


        salvarNoBanco(cod, pre, desc, ima);
        codBarras.setText("");
        preco.setText("");
        descricao.setText("");
        caminhodaimagem.setText("");
        imagem.setImage(new Image("file:" + "C:/Users/aluno/Documents/Bruno Henrique/demo/src/images/fundo.png"));




    }


    @FXML
    public void voltar()throws IOException {
        Stage stage = (Stage) voltarlogin.getScene().getWindow();
        SceneSwitcher.switchScene(stage, "main-view.fxml");

    }

    private void salvarNoBanco(String cod, String pre,String desc, String ima) {
        String url = "jdbc:mysql://localhost:3308/app";
        String user = "root";
        String pwd = "";

        String query = "INSERT INTO produtos (codBarras , preco , descricao ,  imagem) VALUES (?,?,? , ?)";

        try (Connection connection = DriverManager.getConnection(url, user, pwd);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, cod);
            preparedStatement.setString(2, pre);
            preparedStatement.setString(3, desc);
            preparedStatement.setString(4, ima);


            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                sucessocadastro.setText("Produto cadastrado com sucesso!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

