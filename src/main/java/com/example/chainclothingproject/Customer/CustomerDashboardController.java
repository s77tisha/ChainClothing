package com.example.chainclothingproject.Customer;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class CustomerDashboardController
{

    @javafx.fxml.FXML
    private VBox customerVbox;
    @javafx.fxml.FXML
    private BorderPane customerDashboardBoarderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void signoutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addItemOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/AddItem.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @Deprecated
    public void returnOrCancelltemOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/ReturnOrCancelltem.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void trackOrderOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/TrackOrder.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void placeOrderOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PlaceOrder.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void browseAndFilterOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/BrowseAndFilter.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }

    }


    @javafx.fxml.FXML
    public void viewProductAndReviewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/ViewProductAndReview.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void returnOrCancelItemOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/ReturnOrCancelItem.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void feedbackOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/Feedback.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void askQuestionsOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/Ask Questions.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void logOutOA(ActionEvent actionEvent) {
    }
}