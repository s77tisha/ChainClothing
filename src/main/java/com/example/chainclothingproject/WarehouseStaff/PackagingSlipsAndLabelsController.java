package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PackagingSlipsAndLabelsController
{
    @javafx.fxml.FXML
    private TableView<PackagingSlipsAndlabels> PrintSlipsTableView;
    @javafx.fxml.FXML
    private TableColumn<PackagingSlipsAndlabels,String> SlipsTotalPricetableColumn;
    @javafx.fxml.FXML
    private TableColumn<PackagingSlipsAndlabels,String> SlipsProductNameTableColumn;
    @javafx.fxml.FXML
    private Label SlipsLabel;
    @javafx.fxml.FXML
    private TableColumn<PackagingSlipsAndlabels,String> SlipsQuantityTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        SlipsProductNameTableColumn.setCellValueFactory(new PropertyValueFactory<PackagingSlipsAndlabels,String> ("product name"));
        SlipsQuantityTableColumn.setCellValueFactory(new PropertyValueFactory<PackagingSlipsAndlabels,String> ("Quantity"));
        SlipsTotalPricetableColumn.setCellValueFactory(new PropertyValueFactory<PackagingSlipsAndlabels,String> ("Price"));

    }

    @javafx.fxml.FXML
    public void PrintSlipsOnAction(ActionEvent actionEvent) {
    }
}