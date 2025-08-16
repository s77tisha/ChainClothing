package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SetDiscountContoller
{

    @javafx.fxml.FXML
    private TextArea ShowdiscountFormTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void setdiscountOnactonbutton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/DiscountForm.fxml"));
            ShowdiscountFormTextArea.setText(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @Deprecated
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

    @javafx.fxml.FXML
    public void loadproductlistonactionbutton(ActionEvent actionEvent) {
    }
}