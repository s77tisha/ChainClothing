package com.example.chainclothingproject.Customer;

<<<<<<< HEAD
import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
=======
import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
>>>>>>> d29ad5845ce2d0998461b0b2d0c9f87f272eadbf

public class CustomerDashboardController
{

    @javafx.fxml.FXML
    private VBox customerVbox;
    @javafx.fxml.FXML
    private BorderPane customerDashboardBoarderPane;

    @javafx.fxml.FXML
    private BorderPane customerDashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

<<<<<<< HEAD
    @javafx.fxml.FXML
    public void signoutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addItemOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void returnOrCancelltemOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trackOrderOA(ActionEvent actionEvent) {
=======

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




    @javafx.fxml.FXML
    public void trackOrderOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/TrackOrder.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
>>>>>>> d29ad5845ce2d0998461b0b2d0c9f87f272eadbf
    }

    @javafx.fxml.FXML
    public void placeOrderOA(ActionEvent actionEvent) {
<<<<<<< HEAD
=======
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/PlaceOrder.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
>>>>>>> d29ad5845ce2d0998461b0b2d0c9f87f272eadbf
    }

    @javafx.fxml.FXML
    public void browseAndFilterOA(ActionEvent actionEvent) {
<<<<<<< HEAD
    }

    @javafx.fxml.FXML
    public void pastPurchasesAndDownloadOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void accountRegisterOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewProductAndReviewOA(ActionEvent actionEvent) {
    }
}
=======
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
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/askQuestions.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
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
    public void returnOrCancelItemOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/ReturnOrCancelItem.fxml"));
            customerDashboardBoarderPane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }
    }
}
>>>>>>> d29ad5845ce2d0998461b0b2d0c9f87f272eadbf
