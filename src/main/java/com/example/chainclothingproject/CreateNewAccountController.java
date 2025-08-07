package com.example.chainclothingproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CreateNewAccountController
{
    @javafx.fxml.FXML
    private DatePicker dateofbirthdatepicker;
    @javafx.fxml.FXML
    private RadioButton femaleradiobutton;
    @javafx.fxml.FXML
    private TextField fullnametextbox;
    @javafx.fxml.FXML
    private RadioButton maleradiobutton;
    @javafx.fxml.FXML
    private ComboBox choosearolecombobox;
    @javafx.fxml.FXML
    private PasswordField setpasswordpassfield;
    @javafx.fxml.FXML
    private TextField emailaddresstextbox;
    @javafx.fxml.FXML
    private TextField phonenumbertextbox1;
    @javafx.fxml.FXML
    private TextField EnterIDtextbox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void signInifalreadyhaveAnaccountOnActionbutton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginView.fxml"));
            Scene Nextscene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("login View");
            nextStage.setScene(Nextscene);
            nextStage.show();

        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void signuptocreatenewaccountOnActionbutton(ActionEvent actionEvent) {
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setContentText("Account Created Successfully");
        successAlert.show();
    }
}