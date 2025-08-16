package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;


public class RestockItemsController
{

    @javafx.fxml.FXML
    private TableView<RestocksItems>  RestockItemsTableView;
    @javafx.fxml.FXML
    private TableColumn<RestocksItems,String> ReturnedProductTableColumn;
    @javafx.fxml.FXML
    private TextField RestockItemsProductIDTextField;
    @javafx.fxml.FXML
    private TableColumn<RestocksItems,String>  RestockItemsTotalReturnedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RestocksItems,String>  RestockItemsQualityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RestocksItems,String>  RestockItemsStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<RestocksItems,String>  RestockItemsProductIDTableColumn;
    @javafx.fxml.FXML
    private TableView<RestocksItems>  RestockItemsUpdatedReturnedProductTableView;
    @javafx.fxml.FXML
    private TableColumn<RestocksItems,String>  RestockItemsQuantityTableColumn;
    @javafx.fxml.FXML
    private TextField RestockItemsQuantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
        RestockItemsProductIDTableColumn.setCellValueFactory(new PropertyValueFactory<RestocksItems,String>("product id"));
        RestockItemsQuantityTableColumn.setCellValueFactory(new PropertyValueFactory<RestocksItems,String>("Quantity"));
        ReturnedProductTableColumn.setCellValueFactory(new PropertyValueFactory<RestocksItems,String>("returned product"));
        RestockItemsTotalReturnedTableColumn.setCellValueFactory(new PropertyValueFactory<RestocksItems,String>("total returned"));
        RestockItemsQualityTableColumn.setCellValueFactory(new PropertyValueFactory<RestocksItems,String>("restock quality"));
        RestockItemsStatusTableColumn.setCellValueFactory(new PropertyValueFactory<RestocksItems,String>("restock status"));


    }

    @javafx.fxml.FXML
    public void UpdateReturnedInventoryOnAction(ActionEvent actionEvent) {
    }
}