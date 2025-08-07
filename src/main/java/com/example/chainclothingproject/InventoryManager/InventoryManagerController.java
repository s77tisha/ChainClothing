package com.example.chainclothingproject.InventoryManager;



import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class InventoryManagerController
{

    @javafx.fxml.FXML
    private BorderPane InventoryManagerBorderPane;


    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void StockOverviewOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("StockOverview.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }}

    @javafx.fxml.FXML
    public void EditStockOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EditStock.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void DemandForecastOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DemandForecast.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void RestockRequestOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RestockRequest.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void ReturnRestockReviewOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ReturnRestockReview.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void ThresholdSettingsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ThresholdSettings.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void ManageCategoriesOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ManageCategories.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void InventoryReportsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryReports.fxml"));
            InventoryManagerBorderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e) {//


        }
    }

}