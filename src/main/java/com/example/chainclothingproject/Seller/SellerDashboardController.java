package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SellerDashboardController
{
    @javafx.fxml.FXML
    private Label sellernamelabel;
    @javafx.fxml.FXML
    private Label selleridlabel;
    @javafx.fxml.FXML
    private BorderPane borderpane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void setdiscountonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void markordersProcessedonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void customerfeedbackonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void salesreportonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutonbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginView.fxml"));
            Scene Nextscene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("log in View");
            nextStage.setScene(Nextscene);
            nextStage.show();

        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void addproductonbuttonclick(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void viewordersonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateORdeleteonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sellerhomepageonbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/SellerHomepageView.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void inventorystatusonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showproductlisttableviewonbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/ShowProductListView.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }



    }
}