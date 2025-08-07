package com.example.chainclothingproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController
{
    @javafx.fxml.FXML
    private TextField enterusernametextbox1;
    @javafx.fxml.FXML
    private ComboBox chooserolecombobox;
    @javafx.fxml.FXML
    private PasswordField enterpasswordPassfield;
    @javafx.fxml.FXML
    private TextField enteruserIdtextbox2;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginOnacitionbutton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void createnewaccountOnactionbutton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CreateNewAccount.fxml"));
            Scene Nextscene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("create new account View");
            nextStage.setScene(Nextscene);
            nextStage.show();

        }
        catch (Exception e){
            //
        }
    }
}