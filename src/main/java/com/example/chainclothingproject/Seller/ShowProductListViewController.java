package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ShowProductListViewController
{
    @javafx.fxml.FXML
    private TableColumn colorcolumnofshowproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn pricecolumnofshowproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn brandcolumnofshowproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn productnamecolumnofshowproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn descriptioncolumnofshowproductlisttableview;
    @javafx.fxml.FXML
    private TableView productlisttableview;
    @javafx.fxml.FXML
    private TableColumn sizecolumnofshowproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn Categorycolumnofshowproductlisttableview1;
    @javafx.fxml.FXML
    private TableColumn productIDcolumnofshowproductlisttableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void Gotodashboardonactionbutton(ActionEvent actionEvent) {
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