package com.example.chainclothingproject.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddItemController
{
    @javafx.fxml.FXML
    private ComboBox<String> quantityCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> sizeCombobox;
    @javafx.fxml.FXML
    private TextField summaryTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> colourCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addtoCartOA(ActionEvent actionEvent) {
    }
}