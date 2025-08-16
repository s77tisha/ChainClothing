package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import com.example.chainclothingproject.User;
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

    public void sellerinfo(int sellerId, String sellerName){
        selleridlabel.setText(Integer.toString(sellerId));
        sellernamelabel.setText(sellerName);

    }

    @javafx.fxml.FXML
    public void setdiscountonbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/SetDiscount.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void markordersProcessedonbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/MarkOrdersProccessed.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }


    @javafx.fxml.FXML
    public void salesreportonbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/ViewSalesReport.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }



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
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/AddProduct.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void viewordersonbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/ViewOrder.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void updateORdeleteonbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/DeleteProduct.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }

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
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/InventoryStatus.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }

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

    @javafx.fxml.FXML
    public void customerfeedbackQueryonActionbuttonclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/CustomerFeedbackAndReplyToQuery.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }
}