package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PackagingSlipsAndLabelsController
{
    @javafx.fxml.FXML
    private TableView PrintSlipsTableView;
    @javafx.fxml.FXML
    private TableColumn SlipsTotalPricetableColumn;
    @javafx.fxml.FXML
    private TableColumn SlipsProductNameTableColumn;
    @javafx.fxml.FXML
    private Label SlipsLabel;
    @javafx.fxml.FXML
    private TableColumn SlipsQuantityTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void PrintSlipsOnAction(ActionEvent actionEvent) {
    }
}