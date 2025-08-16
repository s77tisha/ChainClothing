package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PendingPackagingController
{
    @javafx.fxml.FXML
    private TableColumn<PendingPackaging,String> PendingPackaginPriceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PendingPackaging,String> PendingPackaginDeliverydateTableColumn;
    @javafx.fxml.FXML
    private TableView<PendingPackaging> PendingPackagingTableView;
    @javafx.fxml.FXML
    private TableColumn<PendingPackaging,String> PendingPackagingOrderIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PendingPackaging,String> PendingPackaginQuantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PendingPackaging,String> PendingPackaginStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PendingPackaging,String> PendingPackaginProductIDPackedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PendingPackaging,String> PendingPackaginUpdatedStatusTableColumn;
    @javafx.fxml.FXML
    private TableView<PendingPackaging> MarkedAsPackedTableView;
    @javafx.fxml.FXML
    private TextField PendingPackaginOrderIDTextField;

    @javafx.fxml.FXML
    public void initialize() {

        PendingPackagingOrderIDTableColumn.setCellValueFactory(new PropertyValueFactory<PendingPackaging,String>("order id"));
        PendingPackaginPriceTableColumn.setCellValueFactory(new PropertyValueFactory<PendingPackaging,String>("price"));
        PendingPackaginQuantityTableColumn.setCellValueFactory(new PropertyValueFactory<PendingPackaging,String>("quantity"));
        PendingPackaginStatusTableColumn.setCellValueFactory(new PropertyValueFactory<PendingPackaging,String>("status"));
        PendingPackaginDeliverydateTableColumn.setCellValueFactory(new PropertyValueFactory<PendingPackaging,String>("delivery date"));
        PendingPackaginProductIDPackedTableColumn.setCellValueFactory(new PropertyValueFactory<PendingPackaging,String>("Updated product id"));
        PendingPackaginUpdatedStatusTableColumn.setCellValueFactory(new PropertyValueFactory<PendingPackaging,String>("Updated status"));


    }

    @javafx.fxml.FXML
    public void StartPackagingOnAction(ActionEvent actionEvent) {
    }
}