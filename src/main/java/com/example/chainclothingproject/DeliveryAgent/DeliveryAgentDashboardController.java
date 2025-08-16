package com.example.chainclothingproject.DeliveryAgent;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DeliveryAgentDashboardController
{

    @javafx.fxml.FXML
    private BorderPane deliveryAgentDashboardBoarderPane;
    @javafx.fxml.FXML
    private VBox deliveryAgentVbox;

    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void logOutOA(ActionEvent actionEvent) {

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



    @javafx.fxml.FXML
    public void handleDeliveriesOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryAgent/HandleDeliveries.fxml"));
            deliveryAgentDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void markOrderOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryAgent/MarkOrder.fxml"));
            deliveryAgentDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }





    @javafx.fxml.FXML
    public void returnDamagedItemsOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryAgent/ReturnDamagedItems.fxml"));
            deliveryAgentDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void viewDeliveryListOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryAgent/ViewDeliveryList.fxml"));
            deliveryAgentDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void updateDeliveryStatusOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryAgent/UpdateDeliveryStatus.fxml"));
            deliveryAgentDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void markDeliveryStatusOA(ActionEvent actionEvent) {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryAgent/MarkDeliveryStatus.fxml"));
            deliveryAgentDashboardBoarderPane.setCenter(fxmlLoader.load());

    }
    catch (Exception e){
        //
    }
    }

    @javafx.fxml.FXML
    public void reportDeliveryIssuesOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryAgent/ReportDeliveryIssues.fxml"));
            deliveryAgentDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void viewDeliveryHistoryOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeliveryAgent/viewDeliveryHistory.fxml"));
            deliveryAgentDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }
}