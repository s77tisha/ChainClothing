package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class InventoryStatusController
{
    @javafx.fxml.FXML
    private BorderPane borderpane;
    @javafx.fxml.FXML
    private ComboBox choosecategorytofilterCombobox;
    @javafx.fxml.FXML
    private TableColumn productNameColumnofInventorystatustableview;
    @javafx.fxml.FXML
    private TableColumn quantityinStockColumnofInventorystatustableview;
    @javafx.fxml.FXML
    private TableColumn productIDColumnofInventorystatustableview;
    @javafx.fxml.FXML
    private TableColumn categoryColumnofInventorystatustableview;
    @javafx.fxml.FXML
    private TableColumn statusflagColumnofInventorystatustableview;
    @javafx.fxml.FXML
    private TableView inventorystatusTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void GobacktoDashboardOnactionButton(ActionEvent actionEvent) {
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
    public void ViewInventoryStatusOnactionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InventoryManager/StockOverview.fxml"));
            borderpane.setCenter(fxmlLoader.load());

        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void FIlterToShowOutofstocksOnactionbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShowAllOnactionbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FilterByCategoryOnactionbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FIlterToShowLowstocksOnlyOnactionbutton(ActionEvent actionEvent) {
    }
}