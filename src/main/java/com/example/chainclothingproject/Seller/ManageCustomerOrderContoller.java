package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManageCustomerOrderContoller
{
    @javafx.fxml.FXML
    private DatePicker orderdateDatepicker;
    @javafx.fxml.FXML
    private CheckBox confirmedcheckboxOrderstatus;
    @javafx.fxml.FXML
    private TextField customernametextbox;
    @javafx.fxml.FXML
    private TextField quantitytextbox;
    @javafx.fxml.FXML
    private TextField customeridtextbox;
    @javafx.fxml.FXML
    private CheckBox cnceledcheckboxOrderstatus;
    @javafx.fxml.FXML
    private TextField productidtextbox;
    @javafx.fxml.FXML
    private Label orderdetailslabel;
    @javafx.fxml.FXML
    private TextField deliveryaddtextbox;
    @javafx.fxml.FXML
    private TextField orderidtextbox;

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
    public void addorderonactionbutton(ActionEvent actionEvent) {
    }
}