package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class InventoryIssuesController
{
    @javafx.fxml.FXML
    private TableColumn<InventoryIssues,String> InventoryIssuesUpdatedProductIDTableColumn;
    @javafx.fxml.FXML
    private TableView<InventoryIssues> InventoryIssuesTableView;
    @javafx.fxml.FXML
    private TableColumn<InventoryIssues,String> IssuesTableColumn;
    @javafx.fxml.FXML
    private TextField ProductIDTextField;
    @javafx.fxml.FXML
    private TableColumn<InventoryIssues,String> IssuesInventoryIssuesTableColumn;
    @javafx.fxml.FXML
    private TableView<InventoryIssues> InventoryIssuesUpdatedTableView;
    @javafx.fxml.FXML
    private TableColumn<InventoryIssues,String> QuantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<InventoryIssues,String> ProductIDTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        ProductIDTableColumn.setCellValueFactory(new PropertyValueFactory<InventoryIssues,String>("product id"));
        QuantityTableColumn.setCellValueFactory(new PropertyValueFactory<InventoryIssues,String>("Quantity"));
        IssuesTableColumn.setCellValueFactory(new PropertyValueFactory<InventoryIssues,String>("issues"));
        InventoryIssuesUpdatedProductIDTableColumn.setCellValueFactory(new PropertyValueFactory<InventoryIssues,String>("Updated id"));
        IssuesInventoryIssuesTableColumn.setCellValueFactory(new PropertyValueFactory<InventoryIssues,String>("Updated issues"));
    }

    @javafx.fxml.FXML
    public void UpdateIssuesOnAction(ActionEvent actionEvent) {
    }
}