package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class EditProductContoller
{

    @javafx.fxml.FXML
    private TableView Editproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn brandcolumnofEditproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn descriptioncolumnofEditproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn pricecolumnofEditproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn colorcolumnofEditproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn productnamecolumnofEditproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn sizecolumnofEditproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn productIDcolumnofEditproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn CategotycolumnofEditproductlisttableview1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void deleteproductFromMemoryonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateproductFromMemoryonbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GobackToDashboardOnActionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller.SellerDashboard.fxml"));
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