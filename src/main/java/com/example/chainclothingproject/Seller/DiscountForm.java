package com.example.chainclothingproject.Seller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class DiscountForm
{
    @javafx.fxml.FXML
    private TextField productpriceTextfield;
    @javafx.fxml.FXML
    private DatePicker DiscountEndDatePicker;
    @javafx.fxml.FXML
    private DatePicker DiscountsratdatePicker;
    @javafx.fxml.FXML
    private TextField productidTextfield;
    @javafx.fxml.FXML
    private ComboBox HowMuchDiscountCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ApplyDiscountPriceinProductListOnactionButton(ActionEvent actionEvent) {
    }
}