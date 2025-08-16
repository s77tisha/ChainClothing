package com.example.chainclothingproject.WarehouseStaff;

import javafx.event.ActionEvent;
<<<<<<< HEAD
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
=======
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
>>>>>>> 0f856be399ffc18f4d934bc71946e9e7c12b6585

public class DispatchScheduleController
{
    @javafx.fxml.FXML
    private TableColumn<DispatchSchedule,String> DiapatchScheduleProductIDUpdatedTableColumn;
    @javafx.fxml.FXML
    private TextField DiapatchScheduleProductIDTextField;
    @javafx.fxml.FXML
    private TableView<DispatchSchedule> UpdatedDispatchScheduleTableView;
    @javafx.fxml.FXML
    private TableColumn<DispatchSchedule,String> DiapatchScheduleDeliveryAssignedTableColumn;
    @javafx.fxml.FXML
    private TableColumn<DispatchSchedule,String> DiapatchScheduleProductIDTableColumn;
    @javafx.fxml.FXML
    private TableView<DispatchSchedule> DiapatchScheduleStatusTableView;
    @javafx.fxml.FXML
    private TableColumn<DispatchSchedule,String> DiapatchScheduleOrderIDtableColumn;
    @javafx.fxml.FXML
    private TableColumn<DispatchSchedule,String> DiapatchScheduleStatusTableColumn;

    @javafx.fxml.FXML
    public void initialize() {

        DiapatchScheduleProductIDTableColumn.setCellValueFactory(new PropertyValueFactory<DispatchSchedule,String>("product id"));
        DiapatchScheduleOrderIDtableColumn.setCellValueFactory(new PropertyValueFactory<DispatchSchedule,String>("Quantity"));
        DiapatchScheduleStatusTableColumn.setCellValueFactory(new PropertyValueFactory<DispatchSchedule,String>("issues"));
        DiapatchScheduleProductIDUpdatedTableColumn.setCellValueFactory(new PropertyValueFactory<DispatchSchedule,String>("Updated id"));
        DiapatchScheduleDeliveryAssignedTableColumn.setCellValueFactory(new PropertyValueFactory<DispatchSchedule,String>("Updated issues"));
    }

    @javafx.fxml.FXML
    public void AssignedToDeliveryAgentOnAction(ActionEvent actionEvent) {
    }
}