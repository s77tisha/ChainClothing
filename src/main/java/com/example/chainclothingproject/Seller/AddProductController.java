package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddProductController
{
    @javafx.fxml.FXML
    private TextField brandtextbox;
    @javafx.fxml.FXML
    private TextField sizetextbox;
    @javafx.fxml.FXML
    private ComboBox categorycombobox;
    @javafx.fxml.FXML
    private TextArea descriptiontextarea;
    @javafx.fxml.FXML
    private TextField EnterproductIDtextbox;
    @javafx.fxml.FXML
    private TextField Enterproductnametextbox;
    @javafx.fxml.FXML
    private TextField pricetextbox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveproductonactionbutton(ActionEvent actionEvent) {


        Alert successAlert = new Alert(Alert.AlertType.CONFIRMATION);
        successAlert.setContentText("Product Added");
        successAlert.show();

    }

    @javafx.fxml.FXML
    public void goBackToHomepageOnactionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/SellerDashboard.fxml"));
            Scene Nextscene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Seller Dashboard View");
            nextStage.setScene(Nextscene);
            nextStage.show();

        }
        catch (Exception e){
            //
        }

    }
}