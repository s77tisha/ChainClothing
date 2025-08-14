package com.example.chainclothingproject.WarehouseStaff;

import javafx.scene.control.Label;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;



public class PendingPackagingController
{

    @javafx.fxml.FXML
    private TableView PendingPackagingTableView;
    @javafx.fxml.FXML
    private TableView MarkedAsPackedTableView;
    @javafx.fxml.FXML
    private TableColumn PendingPackaginPriceTableColumn;
    @javafx.fxml.FXML
    private TableColumn PendingPackaginDeliverydateTableColumn;
    @javafx.fxml.FXML
    private TableColumn PendingPackagingOrderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn PendingPackaginQuantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn PendingPackaginStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn PendingPackaginProductIDPackedTableColumn;
    @javafx.fxml.FXML
    private TableColumn PendingPackaginUpdatedStatusTableColumn;
    @javafx.fxml.FXML
    private TextField PendingPackaginOrderIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void StartPackagingOnAction(ActionEvent actionEvent) {
    }
}