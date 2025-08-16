package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class CustomerFeedbackAndReplyToQueryController
{
    @javafx.fxml.FXML
    private TableColumn CategotycolumnofCustomerFeedbacktableview12;
    @javafx.fxml.FXML
    private TableColumn productIDcolumnofCustomerFeedbacktableview;
    @javafx.fxml.FXML
    private TableColumn productnamecolumnofCustomerFeedbacktableview;
    @javafx.fxml.FXML
    private TableColumn CategotycolumnofCustomerFeedbacktableview1;
    @javafx.fxml.FXML
    private TableColumn CategotycolumnofCustomerFeedbacktableview11;
    @javafx.fxml.FXML
    private TextArea replytoaFeedbackTextArea;
    @javafx.fxml.FXML
    private TableColumn CustomerQueryColumnOfResponsetoQueryTableView;
    @javafx.fxml.FXML
    private TableView CustomerFeedbackQuerytableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void GoToDashboardOnactionButton(ActionEvent actionEvent) {
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
    public void replytofeedbackonactionbutton(ActionEvent actionEvent) {
    }
}