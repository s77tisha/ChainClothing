package com.example.chainclothingproject.WarehouseStaff;

import javafx.scene.control.Label;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StockOverviewController
{

    @javafx.fxml.FXML
    private TableColumn StockOverViewProductIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn StockBelowBeltTableColumn;
    @javafx.fxml.FXML
    private TableColumn EnoughStockTableColumn;
    @javafx.fxml.FXML
    private TableView StockOverViewTableView;
    @javafx.fxml.FXML
    private TextField StockOverViewProductIDTextFieldFxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateStockOverViewOnAction(ActionEvent actionEvent) {
    }
}