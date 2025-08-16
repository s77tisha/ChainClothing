package com.example.chainclothingproject.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javax.swing.*;

public class FeedbackController
{

    @javafx.fxml.FXML
    private TextArea writeFeedbackTextArea;
    @javafx.fxml.FXML
    private TextField enterProductIdTextField;
    @javafx.fxml.FXML
    private ComboBox ratingCB;
    @javafx.fxml.FXML
    private Label statusLB;

    @javafx.fxml.FXML
    public void initialize() {
        ratingCB.getItems().addAll("1", "2", "3", "4", "5");
    }


    @javafx.fxml.FXML
    public void sendFeedbackOA(ActionEvent actionEvent) {

        String feedback = writeFeedbackTextArea.getText().trim();
        String rating = ratingCB.getValue().toString();


        if (feedback.isEmpty() || rating == null) {
            statusLB.setText("Please enter feedback and select a rating.");
            return;
        }


        statusLB.setText("Comment Submitted");


        writeFeedbackTextArea.clear();
        ratingCB.setValue(null);
    }

    @javafx.fxml.FXML
    public void ratingButton(ActionEvent actionEvent) {
    }
}