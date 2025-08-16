package com.example.chainclothingproject.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Collection;

public class BrowseAndFilterController
{
    @javafx.fxml.FXML
    private Label categoryCombobox;
    @javafx.fxml.FXML
    private TableView<String> productTableView;
    @javafx.fxml.FXML
    private TableColumn<BrowseAndFilter,String> discountTC;
    @javafx.fxml.FXML
    private TableColumn<BrowseAndFilter,String> productNameTC;
    @javafx.fxml.FXML
    private TableColumn<BrowseAndFilter,String> productPriceTC;
    @javafx.fxml.FXML
    private TableColumn<BrowseAndFilter,String> availabilityTC;
    @javafx.fxml.FXML
    private ComboBox<String> catagoryCombobox;
    @javafx.fxml.FXML
    private TableColumn<BrowseAndFilter,String> productIdTC;
    @javafx.fxml.FXML
    private TableColumn<BrowseAndFilter,String> brandTC;
    @javafx.fxml.FXML
    private TableColumn<BrowseAndFilter,String> sizeTC;

    ArrayList<BrowseAndFilter> productList;

    @javafx.fxml.FXML
    public void initialize() {
        productList = new ArrayList<BrowseAndFilter>();



        catagoryCombobox.getItems().addAll("Male","Female","Accessories");
        productNameTC.setCellValueFactory(new PropertyValueFactory<BrowseAndFilter, String>("name"));
        productIdTC.setCellValueFactory(new PropertyValueFactory<BrowseAndFilter,String>("id"));
        productPriceTC.setCellValueFactory(new PropertyValueFactory<BrowseAndFilter,String>("price"));
        sizeTC.setCellValueFactory(new PropertyValueFactory<BrowseAndFilter,String>("size"));
        availabilityTC.setCellValueFactory(new PropertyValueFactory<BrowseAndFilter,String>("availability"));
        brandTC.setCellValueFactory(new PropertyValueFactory<BrowseAndFilter,String>("brand"));
        discountTC.setCellValueFactory(new PropertyValueFactory<BrowseAndFilter,String>("discount"));




    }



    @javafx.fxml.FXML
    public void FilterByCategoryOA(ActionEvent actionEvent) {
        String selectedCategory = catagoryCombobox.getValue();

        if (selectedCategory != null && !selectedCategory.isEmpty()) {
            productTableView.getItems().clear();

            for (BrowseAndFilter product : productList) {
                if (product.getName().equals(selectedCategory)) {
                    productTableView.getItems().add(String.valueOf(product));
                }
            }
        }
    }



    @javafx.fxml.FXML
    public void showAllOA(ActionEvent actionEvent) {
        productTableView.getItems().clear();
        productTableView.getItems().addAll(String.valueOf(productList));
    }


}