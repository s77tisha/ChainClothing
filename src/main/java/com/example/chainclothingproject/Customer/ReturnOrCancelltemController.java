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
<<<<<<< HEAD
    private TableView<String> orderTableView;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private TableColumn <?,?> statusTC;
    @javafx.fxml.FXML
    private TableColumn<?,String> itemTC;
=======
    private TableColumn <Class,String> statusTC;
    @javafx.fxml.FXML
    private TableView productTableView;
>>>>>>> d29ad5845ce2d0998461b0b2d0c9f87f272eadbf
    @javafx.fxml.FXML
    private TableColumn productNameTC;
    @javafx.fxml.FXML
    private TableColumn productIdTC;
    @javafx.fxml.FXML
    private TableColumn OrderIdTC;
    @javafx.fxml.FXML
    private TextArea reasonCancleReturnTextArea;
    @javafx.fxml.FXML
    private TextField enterProductIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void myOrderOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void submitOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmOA(ActionEvent actionEvent) {
    }
}