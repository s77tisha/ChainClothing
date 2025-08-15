package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InventoryViewController
{

    @javafx.fxml.FXML
    private TableView InventoryViewTablewView;
    @javafx.fxml.FXML
    private TableView InventoryViewUpdatedStockEntriesTableView;
    @javafx.fxml.FXML
    private TableColumn InventoryViewPhysicalStockEntriesTableColumn;
    @javafx.fxml.FXML
    private TableColumn InventoryViewProductNameTableColumn;
    @javafx.fxml.FXML
    private TextField InventoryViewProductIDTextField;
    @javafx.fxml.FXML
    private TableColumn InventoryViewProductIDUpdatedTableColumn;
    @javafx.fxml.FXML
    private TableColumn InventoryViewProductIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn InventoryViewUpdatedStockEntriesTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void UpdateStockOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void InventoryViewUpdateStockOnAction(ActionEvent actionEvent) {
    }
}

