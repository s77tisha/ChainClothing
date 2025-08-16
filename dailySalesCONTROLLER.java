package com.example.chainclothingproject.Accountant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

/**
 * Controller for the Daily Sales UI.
 * Handles user input for recording daily sales figures for different stores.
 */
public class dailySalesCONTROLLER {

    // FXML UI Components
    @FXML
    private TableView<dailySales1> Tableview;
    @FXML
    private TableColumn<dailySales1, String> storeTableview;
    @FXML
    private TableColumn<dailySales1, LocalDate> Datetableview;
    @FXML
    private TableColumn<dailySales1, Integer> salestableview;
    @FXML
    private TextField TotalSalesTextfield;
    @FXML
    private CheckBox Checkbox; // This checkbox is in the FXML but its use case is not defined.
    @FXML
    private DatePicker LocalDate;
    @FXML
    private ComboBox<String> StoreCombobox;

    // ObservableList to hold the sales data for the TableView.
    // Any changes to this list will automatically update the UI.
    private final ObservableList<dailySales1> salesData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class. This method is automatically called
     * after the FXML file has been loaded. It sets up the UI components.
     */
    @FXML
    public void initialize() {
        // 1. Set up the TableView columns to display data from the dailySales1 model.
        // The string values ("store", "date", "totalSales") must match the property names in the dailySales1 class.
        storeTableview.setCellValueFactory(new PropertyValueFactory<>("store"));
        Datetableview.setCellValueFactory(new PropertyValueFactory<>("date"));
        salestableview.setCellValueFactory(new PropertyValueFactory<>("totalSales"));

        // 2. Link the salesData list to the TableView.
        Tableview.setItems(salesData);

        // 3. Populate the ComboBox with a list of available stores.
        StoreCombobox.setItems(FXCollections.observableArrayList("Main Street Branch", "Downtown Outlet", "Westside Mall Kiosk"));
    }

    /**
     * Handles the click event for the "Add Sales" button.
     * It validates the user's input, creates a new dailySales1 record,
     * adds it to the table, and then clears the input fields.
     *
     * @param actionEvent The event triggered by the button click.
     */
    @FXML
    public void salesbuttononclick(ActionEvent actionEvent) {
        // Get data from input fields
        String store = StoreCombobox.getValue();
        LocalDate date = this.LocalDate.getValue();
        String salesText = TotalSalesTextfield.getText();
        int salesAmount;

        // --- Input Validation ---
        if (store == null || store.isEmpty()) {
            showAlert("Validation Error", "Please select a store from the dropdown.");
            return;
        }

        if (date == null) {
            showAlert("Validation Error", "Please select a valid date.");
            return;
        }

        if (salesText == null || salesText.trim().isEmpty()) {
            showAlert("Validation Error", "Please enter the total sales amount.");
            return;
        }

        // Try to convert the sales text to an integer. If it fails, show an error.
        try {
            salesAmount = Integer.parseInt(salesText);
            if (salesAmount < 0) {
                showAlert("Validation Error", "Sales amount cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Validation Error", "Please enter a valid whole number for sales.");
            return;
        }

        // --- Add Data to Table ---
        // If all validations pass, create a new dailySales1 object and add it to our list.
        dailySales1 newSale = new dailySales1(date, store, salesAmount);
        salesData.add(newSale);

        // --- Clear Input Fields for Next Entry ---
        clearInputFields();
    }

    /**
     * Clears all the input fields on the screen.
     */
    private void clearInputFields() {
        StoreCombobox.setValue(null);
        LocalDate.setValue(null);
        TotalSalesTextfield.clear();
        Checkbox.setSelected(false);
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

/**
 * Data model class to represent a single daily sales record.
 */
class dailySales1 {
    private LocalDate date;
    private String Store;
    private int TotalSales;

    public dailySales1(LocalDate date, String store, int totalSales) {
        this.date = date;
        this.Store = store;
        this.TotalSales = totalSales;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStore() {
        return Store;
    }

    public void setStore(String store) {
        Store = store;
    }

    public int getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(int totalSales) {
        TotalSales = totalSales;
    }
}