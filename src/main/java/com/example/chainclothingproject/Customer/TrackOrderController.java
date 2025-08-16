package com.example.chainclothingproject.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TrackOrderController
{
    @javafx.fxml.FXML
    private TableColumn<?,?> productTC;
    @javafx.fxml.FXML
    private TextField customerIdTextfield;
    @javafx.fxml.FXML
    private TableColumn<?,?> statusTC;
    @javafx.fxml.FXML
    private TableColumn<?,?> customerNameTC;
    @javafx.fxml.FXML
    private TableView<String> displayOrderTableView;
    @javafx.fxml.FXML
    private TableColumn<?,?> customerIdTC;
    @javafx.fxml.FXML
    private TableColumn <?,?>shippingDateTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void myOrderOA(ActionEvent actionEvent) {
    }
}