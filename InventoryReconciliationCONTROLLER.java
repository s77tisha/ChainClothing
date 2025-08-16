package com.example.chainclothingproject.Accountant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

/**
 * Controller for the Inventory Reconciliation UI.
 * Handles user input for recording inventory reconciliation data.
 */
public class InventoryReconciliationCONTROLLER {
    // FXML UI Components
    // Note: These FXML variable names must match the 'fx:id' in your FXML file.
    @FXML
    private TableView<InventoryReconcilationR1> Tableview;
    @FXML
    private TableColumn<InventoryReconcilationR1, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<InventoryReconcilationR1, Integer> productIdTableColumn;
    @FXML
    private TableColumn<InventoryReconcilationR1, Integer> amountTableColumn;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField productIdTextField;
    @FXML
    private TextField amountTextField;

    // ObservableList to hold the reconciliation data for the TableView.
    private final ObservableList<InventoryReconcilationR1> reconciliationData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class. This method is automatically called
     * after the FXML file has been loaded.
     */
    @FXML
    public void initialize() {
        // 1. Set up the TableView columns to display data from the InventoryReconcilationR1 model.
        // The string values ("date", "productId", "amount") must match the property names in the model class.
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        productIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("productId"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));

        // 2. Link the reconciliationData list to the TableView.
        Tableview.setItems(reconciliationData);
    }

    /**
     * Handles the click event for the "Add" button.
     * It validates the user's input, creates a new InventoryReconcilationR1 record,
     * adds it to the table, and then clears the input fields.
     *
     * @param actionEvent The event triggered by the button click.
     */
    @FXML
    public void addButtonOnClick(ActionEvent actionEvent) {
        // Get data from input fields
        LocalDate date = datePicker.getValue();
        String productIdText = productIdTextField.getText();
        String amountText = amountTextField.getText();
        int productId;
        int amount;

        // --- Input Validation ---
        if (date == null) {
            showAlert("Validation Error", "Please select a valid date.");
            return;
        }

        if (productIdText == null || productIdText.trim().isEmpty()) {
            showAlert("Validation Error", "Please enter the Product ID.");
            return;
        }

        if (amountText == null || amountText.trim().isEmpty()) {
            showAlert("Validation Error", "Please enter the amount.");
            return;
        }

        // Try to convert text fields to integers. If it fails, show an error.
        try {
            productId = Integer.parseInt(productIdText);
        } catch (NumberFormatException e) {
            showAlert("Validation Error", "Please enter a valid number for the Product ID.");
            return;
        }

        try {
            amount = Integer.parseInt(amountText);
        } catch (NumberFormatException e) {
            showAlert("Validation Error", "Please enter a valid number for the amount.");
            return;
        }

        // --- Add Data to Table ---
        // If all validations pass, create a new object and add it to our list.
        InventoryReconcilationR1 newReconciliation = new InventoryReconcilationR1(date, productId, amount);
        reconciliationData.add(newReconciliation);

        // --- Clear Input Fields for Next Entry ---
        clearInputFields();
    }

    /**
     * Clears all the input fields on the screen.
     */
    private void clearInputFields() {
        datePicker.setValue(null);
        productIdTextField.clear();
        amountTextField.clear();
    }

    /**
     * A helper method to display an information alert dialog.
     *
     * @param title   The title of the alert window.
     * @param message The message to display inside the alert.
     */
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null); // No header text
        alert.setContentText(message);
        alert.showAndWait();
    }
}