package com.example.chainclothingproject.InventoryManager;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RestockRequestController
{
    @javafx.fxml.FXML
    private TextField QuantityTextField;
    @javafx.fxml.FXML
    private TextField DeliveryTextFiled;
    @javafx.fxml.FXML
    private TableView RestockRequestTablView;
    @javafx.fxml.FXML
    private TextField ProductIDTextField;
    @javafx.fxml.FXML
    private TableColumn DeliveryDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn RestockRequestProductIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn QuantityTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddToTableOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LowStockOnAction(ActionEvent actionEvent) {
    }
}