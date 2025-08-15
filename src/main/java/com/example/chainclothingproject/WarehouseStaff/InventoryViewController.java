package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryViewController
{
    @javafx.fxml.FXML
    private TableView<Inventoryview> InventoryViewUpdatedStockEntriesTableView;
    @javafx.fxml.FXML
    private TableColumn<Inventoryview,String> InventoryViewPhysicalStockEntriesTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Inventoryview,String> InventoryViewProductNameTableColumn;
    @javafx.fxml.FXML
    private TableView<Inventoryview> InventoryViewTablewView;
    @javafx.fxml.FXML
    private TextField InventoryViewProductIDTextField;
    @javafx.fxml.FXML
    private TableColumn<Inventoryview,String> InventoryViewProductIDUpdatedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Inventoryview,String> InventoryViewProductIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Inventoryview,String> InventoryViewUpdatedStockEntriesTableColumn;

    @javafx.fxml.FXML
    public void initialize() {

        InventoryViewProductIdTableColumn.setCellValueFactory(new PropertyValueFactory<Inventoryview,String>("product id"));
        InventoryViewProductNameTableColumn.setCellValueFactory(new PropertyValueFactory<Inventoryview,String>("product name"));
        InventoryViewPhysicalStockEntriesTableColumn.setCellValueFactory(new PropertyValueFactory<Inventoryview,String>("physical stock entries"));
        InventoryViewProductIDUpdatedTableColumn.setCellValueFactory(new PropertyValueFactory<Inventoryview,String>("Updated  product id"));
        InventoryViewUpdatedStockEntriesTableColumn.setCellValueFactory(new PropertyValueFactory<Inventoryview,String>("Updated physical stock entries"));

    }

    @javafx.fxml.FXML
    public void InventoryViewUpdateStockOnAction(ActionEvent actionEvent) {
    }
}