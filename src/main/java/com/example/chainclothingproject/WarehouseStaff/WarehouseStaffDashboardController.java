package com.example.chainclothingproject.WarehouseStaff;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WarehouseStaffDashboardController
{
    @javafx.fxml.FXML
    private VBox WarehouseStaffVBoxFxid;
    @javafx.fxml.FXML
    private BorderPane WarehouseBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void InventoryIssuesOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryIssues.fxml"));
            WarehouseBorderPane.setCenter(fxmlLoader.load());

        }catch (Exception e){//}
    }}

    @javafx.fxml.FXML
    public void PendingPackagingOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PendingPackaging.fxml"));
            WarehouseBorderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void PackingSlipsAndLabels(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PendingPackaging.fxml"));
            WarehouseBorderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//
    }}


    @javafx.fxml.FXML
    public void RestockItemsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RestockItems.fxml"));
            WarehouseBorderPane.setCenter(fxmlLoader.load());

        }catch (Exception e){//
        }
    }

    @javafx.fxml.FXML
    public void StockOverviewOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("StockOverview.fxml"));
            WarehouseBorderPane.setCenter(fxmlLoader.load());
        } catch (Exception e) {//
        }
    }

    @javafx.fxml.FXML
    public void PackedAndDispatchOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PackedAndDispatch.fxml"));
            WarehouseBorderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void InventoryViewOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryView.fxml"));
            WarehouseBorderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//


        }
    }

    @javafx.fxml.FXML
    public void DispatchScheduleOnAction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DispatchSchedule.fxml"));
            WarehouseBorderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {//


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



