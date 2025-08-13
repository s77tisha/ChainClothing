package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SetDiscountContoller
{
    @javafx.fxml.FXML
    private TextField productpriceTextfield;
    @javafx.fxml.FXML
    private TextField ProductnameTextfield;
    @javafx.fxml.FXML
    private DatePicker DiscountEndDatePicker;
    @javafx.fxml.FXML
    private DatePicker DiscountsratdatePicker;
    @javafx.fxml.FXML
    private TextField productidTextfield;
    @javafx.fxml.FXML
    private ComboBox HowMuchDiscountCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void setdiscountOnactonbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdatepriceinProductListOnactionButton(ActionEvent actionEvent) {
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
}