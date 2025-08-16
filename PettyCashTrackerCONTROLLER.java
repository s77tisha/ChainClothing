package com.example.chainclothingproject.Accountant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

/**
 * Controller for the Petty Cash Tracker UI.
 * Handles user input for recording small cash expenses.
 */
public class PettycashTrackerCONTROLLER {

    // FXML UI Components
    // Note: These FXML variable names must match the 'fx:id' in your FXML file.
    @FXML
    private TableView<PettycashTracker> Tableview;
    @FXML
    private TableColumn<PettycashTracker, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<PettycashTracker, String> categoryTableColumn;
    @FXML
    private TableColumn<PettycashTracker, String> amountTableColumn;
    @FXML
    private DatePicker datePicker;
    @FXML
    private ComboBox<String> categoryComboBox;
    @FXML
    private TextField amountTextField;

    // ObservableList to hold the petty cash data for the TableView.
    private final ObservableList<PettycashTracker> pettyCashData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class. This method is automatically called
     * after the FXML file has been loaded.
     */
    @FXML
    public void initialize() {
        // 1. Set up the TableView columns to display data from the PettycashTracker model.
        // The string values ("date", "catagory", "amount") must match the property names in the model class.
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("catagory"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));

        // 2. Link the pettyCashData list to the TableView.
        Tableview.setItems(pettyCashData);

        // 3. Populate the ComboBox with a list of common expense categories.
        categoryComboBox.setItems(FXCollections.observableArrayList("Office Supplies", "Travel", "Meals", "Postage", "Miscellaneous"));
    }

    /**
     * Handles the click event for the "Add" button.
     * It validates the user's input, creates a new PettycashTracker record,
     * adds it to the table, and then clears the input fields.
     *
     * @param actionEvent The event triggered by the button click.
     */
    @FXML
    public void addButtonOnClick(ActionEvent actionEvent) {
        // Get data from input fields
        LocalDate date = datePicker.getValue();
        String category = categoryComboBox.getValue();
        String amountText = amountTextField.getText();

        // --- Input Validation ---
        if (date == null) {
            showAlert("Validation Error", "Please select a valid date.");
            return;
        }

        if (category == null || category.isEmpty()) {
            showAlert("Validation Error", "Please select a category from the dropdown.");
            return;
        }

        if (amountText == null || amountText.trim().isEmpty()) {
            showAlert("Validation Error", "Please enter the expense amount.");
            return;
        }

        // Try to convert the amount text to a number to ensure it's valid,
        // though we will store it as a String per the model's definition.
        try {
            double amountValue = Double.parseDouble(amountText);
            if (amountValue <= 0) {
                showAlert("Validation Error", "Amount must be a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Validation Error", "Please enter a valid number for the amount.");
            return;
        }

        // --- Add Data to Table ---
        // If all validations pass, create a new PettycashTracker object and add it to our list.
        PettycashTracker newEntry = new PettycashTracker(date, category, amountText);
        pettyCashData.add(newEntry);

        // --- Clear Input Fields for Next Entry ---
        clearInputFields();
    }

    /**
     * Clears all the input fields on the screen.
     */
    private void clearInputFields() {
        datePicker.setValue(null);
        categoryComboBox.setValue(null);
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


public class PettycashTrackerCONTROLLER {

    // FXML UI Components
    // Note: These FXML variable names must match the 'fx:id' in your FXML file.
    @FXML
    private TableView<PettycashTracker> Tableview;
    @FXML
    private TableColumn<PettycashTracker, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<PettycashTracker, String> categoryTableColumn;
    @FXML
    private TableColumn<PettycashTracker, String> amountTableColumn;
    @FXML
    private DatePicker datePicker;
    @FXML
    private ComboBox<String> categoryComboBox;
    @FXML
    private TextField amountTextField;

    // ObservableList to hold the petty cash data for the TableView.
    private final ObservableList<PettycashTracker> pettyCashData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class. This method is automatically called
     * after the FXML file has been loaded.
     */
    @FXML
    public void initialize() {
        // 1. Set up the TableView columns to display data from the PettycashTracker model.
        // The string values ("date", "catagory", "amount") must match the property names in the model class.
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("catagory"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));

        // 2. Link the pettyCashData list to the TableView.
        Tableview.setItems(pettyCashData);

        // 3. Populate the ComboBox with a list of common expense categories.
        categoryComboBox.setItems(FXCollections.observableArrayList("Office Supplies", "Travel", "Meals", "Postage", "Miscellaneous"));
    }

    /**
     * Handles the click event for the "Add" button.
     * It validates the user's input, creates a new PettycashTracker record,
     * adds it to the table, and then clears the input fields.
     *
     * @param actionEvent The event triggered by the button click.
     */
    @FXML
    public void addButtonOnClick(ActionEvent actionEvent) {
        // Get data from input fields
        LocalDate date = datePicker.getValue();
        String category = categoryComboBox.getValue();
        String amountText = amountTextField.getText();

        // --- Input Validation ---
        if (date == null) {
            showAlert("Validation Error", "Please select a valid date.");
            return;
        }

        if (category == null || category.isEmpty()) {
            showAlert("Validation Error", "Please select a category from the dropdown.");
            return;
        }

        if (amountText == null || amountText.trim().isEmpty()) {
            showAlert("Validation Error", "Please enter the expense amount.");
            return;
        }

        // Try to convert the amount text to a number to ensure it's valid,
        // though we will store it as a String per the model's definition.
        try {
            double amountValue = Double.parseDouble(amountText);
            if (amountValue <= 0) {
                showAlert("Validation Error", "Amount must be a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Validation Error", "Please enter a valid number for the amount.");
            return;
        }

        // --- Add Data to Table ---
        // If all validations pass, create a new PettycashTracker object and add it to our list.
        PettycashTracker newEntry = new PettycashTracker(date, category, amountText);
        pettyCashData.add(newEntry);

        // --- Clear Input Fields for Next Entry ---
        clearInputFields();
    }

    /**
     * Clears all the input fields on the screen.
     */
    private void clearInputFields() {
        datePicker.setValue(null);
        categoryComboBox.setValue(null);
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