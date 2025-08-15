package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DispatchScheduleController
{

    @javafx.fxml.FXML
    private TableView UpdatedDispatchScheduleTableView;
    @javafx.fxml.FXML
    private TableView DiapatchScheduleStatusTableView;
    @javafx.fxml.FXML
    private TableColumn DiapatchScheduleStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn DiapatchScheduleProductIDUpdatedTableColumn;
    @javafx.fxml.FXML
    private TextField DiapatchScheduleProductIDTextField;
    @javafx.fxml.FXML
    private TableColumn DiapatchScheduleDeliveryAssignedTableColumn;
    @javafx.fxml.FXML
    private TableColumn DiapatchScheduleProductIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn DiapatchScheduleOrderIDtableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AssignedToDeliveryAgentOnAction(ActionEvent actionEvent) {
    }
}

