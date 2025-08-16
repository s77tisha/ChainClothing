package com.example.chainclothingproject.Customer;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AddItemController
{
    @javafx.fxml.FXML
    private TableColumn<AddItem,String>  brandTC;
    @javafx.fxml.FXML
    private TextField enterProductIdTextField1;
    @javafx.fxml.FXML
    private TableColumn<AddItem,String>  availabilityTC;
    @javafx.fxml.FXML
    private TableColumn<AddItem,String>  productIdTC;
    @javafx.fxml.FXML
    private TableColumn<AddItem,String>  sizeTC;
    @javafx.fxml.FXML
    private TableView<String> productTableView;
    @javafx.fxml.FXML
    private TableColumn<AddItem,String>  discountTC;
    @javafx.fxml.FXML
    private TableColumn<AddItem,String>  productNameTC;
    @javafx.fxml.FXML
    private TableColumn<AddItem,String>  productPriceTC;
    @javafx.fxml.FXML
    private TextField enterProductIdTextField;

    ArrayList<AddItem>ProductList;
    @javafx.fxml.FXML
    private TableColumn feedbackTC;

    @javafx.fxml.FXML
    public void initialize() {

        ProductList =new ArrayList<>();

        productNameTC.setCellValueFactory(new PropertyValueFactory<AddItem, String>("name"));
        productIdTC.setCellValueFactory(new PropertyValueFactory<AddItem,String>("id"));
        productPriceTC.setCellValueFactory(new PropertyValueFactory<AddItem,String>("price"));
        sizeTC.setCellValueFactory(new PropertyValueFactory<AddItem,String>("size"));
        availabilityTC.setCellValueFactory(new PropertyValueFactory<AddItem,String>("availability"));
        brandTC.setCellValueFactory(new PropertyValueFactory<AddItem,String>("brand"));
        discountTC.setCellValueFactory(new PropertyValueFactory<AddItem,String>("discount"));
        feedbackTC.setCellValueFactory(new PropertyValueFactory<AddItem,String>("feedback"));



    }

    @javafx.fxml.FXML
    public void cancleFromCartOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addToCartOA(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void productDetailsOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/BrowseAndFilter.fxml"));
            Scene Nextscene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Customer/BrowseAndFilter");
            nextStage.setScene(Nextscene);
            nextStage.show();

        }
        catch (Exception e){
            //
        }

    }
}