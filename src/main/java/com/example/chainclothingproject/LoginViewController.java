package com.example.chainclothingproject;

import com.example.chainclothingproject.Seller.SellerDashboardController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

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
        chooserolecombobox.getItems().addAll("Accountant"," Marketing Manager","Warehouse Staff"," Inventory Manager","Seller","Customer","Return Agent","Delivery Agent");
    }

    @javafx.fxml.FXML
    public void loginOnacitionbutton(ActionEvent actionEvent) {
        String enteredIdText = enteruserIdtextbox2.getText();
        String enteredUsername = enterusernametextbox1.getText();
        String enteredPassword = enterpasswordPassfield.getText();
        String enteredRole = (String) chooserolecombobox.getValue();


        if (enteredIdText.isEmpty() || enteredUsername.isEmpty() ||
                enteredPassword.isEmpty() || enteredRole == null) {
            Alert fillupalert = new Alert(Alert.AlertType.ERROR);
            fillupalert.setContentText("Please fill in all fields!");
            fillupalert.showAndWait();
            return;
        }

        int enteredId= Integer.parseInt(enteredIdText);

        boolean loginSuccess = false;


        File f = new File("UserRecord.bin");

        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    User u = (User) ois.readObject();

                    if (u.getId() == enteredId &&
                            u.getName().equals(enteredUsername) &&
                            u.getPassword().equals(enteredPassword) &&
                            u.getRole().equals(enteredRole)) {

                        loginSuccess = true;
                        break;
                    }

                } catch (Exception e) {

                }
            }
        } catch (Exception  e) {
            //
        }

        if (loginSuccess) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Login Successful!");
            alert.showAndWait();

                String fxmlPath = null;

                if (enteredRole.equals("Seller")) {
                    fxmlPath = "/com/example/chainclothingproject/Seller/SellerDashboard.fxml";
                }  else if (enteredRole.equals("ReturnAgent")) {
                    fxmlPath = "/com/example/chainclothingproject/ReturnAgent/ReturnAgentDashboard.fxml";
                }

                if (fxmlPath != null) {
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlPath));
                        Scene Nextscene = new Scene(fxmlLoader.load());
                        Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                        nextStage.setTitle(enteredRole + " Dashboard");
                        nextStage.setScene(Nextscene);
                        SellerDashboardController nextController = fxmlLoader.getController();
                        nextController.sellerinfo(enteredId,enteredUsername);
                        nextStage.show();

                    } catch (Exception e) {

                    }
                }



            }

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