package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ViewOrderContoller
{

    @javafx.fxml.FXML
    private TableColumn CustomernameColumnOfviewCustomerordertable;
    @javafx.fxml.FXML
    private TextField EnterOrderIDtoseeOrderdetailsTextbox;
    @javafx.fxml.FXML
    private TextArea showorderdetailstextarea;
    @javafx.fxml.FXML
    private TableColumn ItemColumnofViewCustomerorderTable;
    @javafx.fxml.FXML
    private TableColumn orderIDcolumnOfViewCustomerordertable;
    @javafx.fxml.FXML
    private TableView ViewCustomerOrdersTableView;
    @javafx.fxml.FXML
    private TableColumn IsReturnedColumnOfViewOrders;
    @javafx.fxml.FXML
    private TableColumn IsPaidColumnofViewCustomerorderTable1;
    @javafx.fxml.FXML
    private TableColumn IsCanceledColumnofViewCustomerorderTable11;
    @javafx.fxml.FXML
    private TableColumn IsDeliveredColumnOfViewOrders;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void gobacktodashboardonactionbutton(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void showallorderonactionbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewAorderDetailsonactionbutton(ActionEvent actionEvent) {
    }
}