package com.example.chainclothingproject.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TrackOrderController
{
    @javafx.fxml.FXML
<<<<<<< HEAD
    private TableColumn<?,?> productTC;
    @javafx.fxml.FXML
    private TextField customerIdTextfield;
    @javafx.fxml.FXML
    private TableColumn<?,?> statusTC;
    @javafx.fxml.FXML
    private TableColumn<?,?> customerNameTC;
=======
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableView productTableView;
>>>>>>> d29ad5845ce2d0998461b0b2d0c9f87f272eadbf
    @javafx.fxml.FXML
    private TableColumn productNameTC;
    @javafx.fxml.FXML
<<<<<<< HEAD
    private TableColumn<?,?> customerIdTC;
    @javafx.fxml.FXML
    private TableColumn <?,?>shippingDateTC;
=======
    private TableColumn productIdTC;
    @javafx.fxml.FXML
    private TableColumn dateOfDeliveryTC;
    @javafx.fxml.FXML
    private TableColumn OrderIdTC;
>>>>>>> d29ad5845ce2d0998461b0b2d0c9f87f272eadbf

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void myOrderOA(ActionEvent actionEvent) {
    }
}