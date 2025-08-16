package com.example.chainclothingproject.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * Controller for the main Accountant Dashboard.
 * Provides navigation to different accounting sections of the application.
 */
public class AccountantDashboradCONTROLLER {

    @FXML
    public void initialize() {
        // Initialization logic can go here if needed in the future.
    }

    // --- Button Handlers ---

    @FXML
    public void ButtononclickDailysalesLog(ActionEvent actionEvent) throws IOException {
        // IMPORTANT: Replace with your actual FXML file path
        switchScene(actionEvent, "dailySales.fxml", "Daily Sales Log");
    }

    @FXML
    public void ButtononclickExpensesTracker(ActionEvent actionEvent) throws IOException {
        // IMPORTANT: Replace with your actual FXML file path
        switchScene(actionEvent, "expensesTracker.fxml", "Expenses Tracker");
    }

    @FXML
    public void ButtononclickCashTracker(ActionEvent actionEvent) throws IOException {
        // This corresponds to the Petty Cash Tracker
        // IMPORTANT: Replace with your actual FXML file path
        switchScene(actionEvent, "pettyCashTracker.fxml", "Petty Cash Tracker");
    }

    @FXML
    public void ButtononclickInventoryReconciliation(ActionEvent actionEvent) throws IOException {
        // IMPORTANT: Replace with your actual FXML file path
        switchScene(actionEvent, "inventoryReconciliation.fxml", "Inventory Reconciliation");
    }

    // --- Placeholder Methods for Future Implementation ---
    // You can add FXML files and logic for these buttons later.

    @FXML
    public void ButtononclickPayrollAdjustments(ActionEvent actionEvent) {
        System.out.println("Payroll Adjustments button clicked - No scene configured.");
        // Example: switchScene(actionEvent, "payroll.fxml", "Payroll Adjustments");
    }

    @FXML
    public void ButtononclickVendorManagement(ActionEvent actionEvent) {
        System.out.println("Vendor Management button clicked - No scene configured.");
        // Example: switchScene(actionEvent, "vendorManagement.fxml", "Vendor Management");
    }

    @FXML
    public void ButtononclickSupplierInvoices(ActionEvent actionEvent) {
        System.out.println("Supplier Invoices button clicked - No scene configured.");
        // Example: switchScene(actionEvent, "supplierInvoices.fxml", "Supplier Invoices");
    }

    @FXML
    public void ButtononclickPayments(ActionEvent actionEvent) {
        System.out.println("Payments button clicked - No scene configured.");
        // Example: switchScene(actionEvent, "payments.fxml", "Payments");
    }



    private void switchScene(ActionEvent actionEvent, String fxmlFile, String title) throws IOException {
        // Construct the full path to the FXML file relative to this class.
        String fullPath = "/com/example/chainclothingproject/Accountant/" + fxmlFile;
        Parent newSceneParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fullPath)));
        Scene newScene = new Scene(newSceneParent);

        // Get the Stage (window) from the event source.
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        // Set the new scene and title, then show it.
        window.setScene(newScene);
        window.setTitle(title);
        window.show();
    }
}
