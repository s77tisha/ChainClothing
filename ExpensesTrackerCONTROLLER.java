package com.example.chainclothingproject.Accountant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Controller for the Expenses Tracker UI.
 * Handles user input for recording various business expenses.
 */
public class ExpensesTrackerCONTROLLER {
    // FXML UI Components
    @FXML
    private TableView<ExpensesTracker1> Tableview;
    @FXML
    private TableColumn<ExpensesTracker1, String> Vendortableview;
    @FXML
    private TableColumn<ExpensesTracker1, Integer> amounttableview;
    @FXML
    private TextField amounttextfiled;
    @FXML
    private ComboBox<String> Vendornamecombobox;

    // ObservableList to hold the expense data for the TableView.
    private final ObservableList<ExpensesTracker1> expensesData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class. This method is automatically called
     * after the FXML file has been loaded.
     */
    @FXML
    public void initialize() {
        // 1. Set up the TableView columns to display data from the ExpensesTracker1 model.
        // The string values ("vendorname", "amount") must match the property names in the ExpensesTracker1 class.
        Vendortableview.setCellValueFactory(new PropertyValueFactory<>("vendorname"));
        amounttableview.setCellValueFactory(new PropertyValueFactory<>("amount"));

        // 2. Link the expensesData list to the TableView.
        Tableview.setItems(expensesData);

        // 3. Populate the ComboBox with a list of common vendors or expense types.
        Vendornamecombobox.setItems(FXCollections.observableArrayList("Office Supplies Inc.", "Utility Co.", "Rent Payment", "Marketing Agency"));
    }


    /**
     * Handles the click event for the "Add Expense" button.
     * It validates the user's input, creates a new ExpensesTracker1 record,
     * adds it to the table, and then clears the input fields.
     *
     * @param actionEvent The event triggered by the button click.
     */
    @FXML
    public void buttoononaction(ActionEvent actionEvent) {
        // Get data from input fields
        String vendorName = Vendornamecombobox.getValue();
        String amountText = amounttextfiled.getText();
        int amount;

        // --- Input Validation ---
        if (vendorName == null || vendorName.isEmpty()) {
            showAlert("Validation Error", "Please select a vendor from the dropdown.");
            return;
        }

        if (amountText == null || amountText.trim().isEmpty()) {
            showAlert("Validation Error", "Please enter the expense amount.");
            return;
        }

        // Try to convert the amount text to an integer. If it fails, show an error.
        try {
            amount = Integer.parseInt(amountText);
            if (amount <= 0) {
                showAlert("Validation Error", "Amount must be a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Validation Error", "Please enter a valid whole number for the amount.");
            return;
        }

        // --- Add Data to Table ---
        // If all validations pass, create a new ExpensesTracker1 object and add it to our list.
        ExpensesTracker1 newExpense = new ExpensesTracker1(vendorName, amount);
        expensesData.add(newExpense);

        // --- Clear Input Fields for Next Entry ---
        clearInputFields();
    }

    /**
     * Clears all the input fields on the screen.
     */
    private void clearInputFields() {
        Vendornamecombobox.setValue(null);
        amounttextfiled.clear();
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
