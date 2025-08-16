package com.example.chainclothingproject.DeliveryAgent;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HandleDeliveriesController
{
    @javafx.fxml.FXML
    private TableView productTableView;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableColumn productNameTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn productIdTC;
    @javafx.fxml.FXML
    private TextArea updateStatusTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void failedOA(ActionEvent actionEvent) {
    }
}