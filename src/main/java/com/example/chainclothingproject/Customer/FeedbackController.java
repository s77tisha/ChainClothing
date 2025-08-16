package com.example.chainclothingproject.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FeedbackController
{

    @javafx.fxml.FXML
    private TableView productTableView;
    @javafx.fxml.FXML
    private TableColumn productNameTC;
    @javafx.fxml.FXML
    private TextArea writeFeedbackTextArea;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TextField enterProductIdTextField;
    @javafx.fxml.FXML
    private TableColumn productIdTC;
    @javafx.fxml.FXML
    private TableColumn OrderIdTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void myOrderOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendFeedbackOA(ActionEvent actionEvent) {
    }
}