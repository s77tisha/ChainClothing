package com.example.chainclothingproject.InventoryManager;



import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class InventoryManagerDashboardController
{

    @javafx.fxml.FXML
    private BorderPane InventoryManagerBorderPane;


    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void StockOverviewOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/StockOverview.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }}

    @javafx.fxml.FXML
    public void EditStockOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/EditStock.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void DemandForecastOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/DemandForecast.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void RestockRequestOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/RestockRequest.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void ReturnRestockReviewOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/ReturnRestockReview.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void ThresholdSettingsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/ThresholdSettings.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void ManageCategoriesOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/ManageCategories.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void InventoryReportsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/InventoryReports.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void LogOutOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginView.fxml"));
            Scene Nextscene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("login View");
            nextStage.setScene(Nextscene);
            nextStage.show();

        }
        catch (Exception e){
            //
        }
    }


}