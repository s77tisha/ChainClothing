package com.example.chainclothingproject.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ReturnOrCancelltemController
{
    @javafx.fxml.FXML
    private RadioButton cancelRB;
    @javafx.fxml.FXML
    private RadioButton returnRB;
    @javafx.fxml.FXML
    private TableView<String> orderTableView;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private TableColumn <Class,String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<Class,String> itemTC;
    @javafx.fxml.FXML
    private ComboBox<String> reasonCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void myOrderOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitOA(ActionEvent actionEvent) {
    }
}