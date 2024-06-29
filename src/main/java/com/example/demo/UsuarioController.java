package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioController {
    @FXML
    private Label label;
    @FXML
    private Label preco;
    @FXML
    private Label descricao;
    @FXML
    private ImageView produtosimages;
    @FXML
    private TextField codigo;
    @FXML
    private Hyperlink login;

    private String url = "jdbc:mysql://localhost:3308/app";  // Port corrected to 5432
    private String user = "root";
    private String psw = "";

    @FXML
    public void Logintela()throws IOException {
        Stage stage = (Stage) login.getScene().getWindow();
        SceneSwitcher.switchScene(stage, "login-view.fxml");
    }

    @FXML
    private void updateProductInfo() {
        String codigoProduto = codigo.getText();

        if (codigoProduto != null) {

            String query = String.format("SELECT descricao,preco,imagem FROM produtos WHERE codBarras = '%s'",
                    codigoProduto);

            try (Connection connection = DriverManager.getConnection(url, user, psw);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {


                if (resultSet.next()) {
                    String imagemPath = resultSet.getString("imagem");
                    String precoValue = resultSet.getString("preco");
                    String descricaoValue = resultSet.getString("descricao");

                    produtosimages.setImage(new Image("file:" + imagemPath));
                    preco.setText("R$ " + precoValue.replace(".",","));
                    descricao.setWrapText(true);
                    descricao.setText(descricaoValue);

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    codigo.setText("");
    }
}
