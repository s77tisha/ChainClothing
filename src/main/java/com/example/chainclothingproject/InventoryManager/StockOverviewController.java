package com.example.chainclothingproject.InventoryManager;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class StockOverviewController
{
    @javafx.fxml.FXML
    private TableView InventoryStockOverViewTableColumn;
    @javafx.fxml.FXML
    private TableColumn StockOverviewProductIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn NameTableColumn;
    @javafx.fxml.FXML
    private TableColumn CategoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn QuantityTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void HighlightBelowThresholdOnAction(ActionEvent actionEvent) {
    }
}