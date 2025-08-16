package com.example.chainclothingproject.DeliveryAgent;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ViewDeliveryHistoryController
{
    @javafx.fxml.FXML
    private TableColumn successRateTC;
    @javafx.fxml.FXML
    private TextArea summaryTA;
    @javafx.fxml.FXML
    private TableView statusTV;
    @javafx.fxml.FXML
    private TableColumn averageTimeTC;
    @javafx.fxml.FXML
    private TableColumn totalDeliveriesTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void statusOA(ActionEvent actionEvent) {
    }
}