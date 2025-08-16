package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StockOverviewController
{
    @javafx.fxml.FXML
    private TableColumn<StockOverview,String> StockOverViewProductIDTableColumn;
    @javafx.fxml.FXML
    private TextField StockOverViewProductIDTextFieldFxid;
    @javafx.fxml.FXML
    private TableColumn<StockOverview,String> StockBelowBeltTableColumn;
    @javafx.fxml.FXML
    private TableColumn<StockOverview,String> EnoughStockTableColumn;
    @javafx.fxml.FXML
    private TableView<StockOverview> StockOverViewTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateStockOverViewOnAction(ActionEvent actionEvent) {
        StockOverViewProductIDTableColumn.setCellValueFactory(new PropertyValueFactory<StockOverview,String>("product id"));
        StockBelowBeltTableColumn.setCellValueFactory(new PropertyValueFactory<StockOverview,String>("stock below belt"));
        EnoughStockTableColumn.setCellValueFactory(new PropertyValueFactory<StockOverview,String>("enough stock"));


    }

}
