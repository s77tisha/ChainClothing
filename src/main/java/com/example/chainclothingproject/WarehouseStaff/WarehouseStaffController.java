package com.example.chainclothingproject.WarehouseStaff;


import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class WarehouseStaffController
{
    @javafx.fxml.FXML
    private BorderPane WarehouseBoarderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void InventoryIssuesOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryIssues.fxml"));
            WarehouseBoarderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//
        }}

    @javafx.fxml.FXML
    public void PendingPackagingOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PendingPackaging.fxml"));
            WarehouseBoarderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void PackedAndDispatchOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PackedAndDispatch.fxml"));
            WarehouseBoarderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//


        }
    }


    @javafx.fxml.FXML
    public void InventoryViewOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryView.fxml"));
            WarehouseBoarderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void RestockItemsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RestockItems.fxml"));
            WarehouseBoarderPane.setCenter(fxmlLoader.load());

        }catch (Exception e){//
        }
    }


    @javafx.fxml.FXML
    public void DispatchScheduleOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DispatchSchedule.fxml"));
            WarehouseBoarderPane.setCenter(fxmlLoader.load());
        } catch (Exception e) {//
        }

    }


    @javafx.fxml.FXML
    public void StockOverviewOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("StockOverview.fxml"));
            WarehouseBoarderPane.setCenter(fxmlLoader.load());
        } catch (Exception e) {//
        }
    }





    @javafx.fxml.FXML
    public void PackingSlipsAndLabels(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PackingSlipsAndLabels.fxml"));
            WarehouseBoarderPane.setCenter(fxmlLoader.load());
        } catch (Exception e) {//
        }
    }

}
