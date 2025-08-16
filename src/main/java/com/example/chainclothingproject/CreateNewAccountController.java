package com.example.chainclothingproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

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
    private ComboBox<String> choosearolecombobox;
    @javafx.fxml.FXML
    private PasswordField setpasswordpassfield;
    @javafx.fxml.FXML
    private TextField emailaddresstextbox;
    @javafx.fxml.FXML
    private TextField phonenumbertextbox1;
    @javafx.fxml.FXML
    private TextField EnterIDtextbox;

     ArrayList<User> userList;

    ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {
        userList= new ArrayList<User>();
        tg = new ToggleGroup();
        maleradiobutton.setToggleGroup(tg);
        femaleradiobutton.setToggleGroup(tg);
        dateofbirthdatepicker.setValue(LocalDate.now());
        choosearolecombobox.getItems().addAll("Accountant"," Marketing Manager","Warehouse Staff"," Inventory Manager","Seller","Customer","Return Agent","Delivery Agent");

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


        if (EnterIDtextbox.getText().isEmpty()||
                fullnametextbox.getText().isEmpty()||
                phonenumbertextbox1.getText().isEmpty()||
                emailaddresstextbox.getText().isEmpty()||
                dateofbirthdatepicker.getValue().isAfter(LocalDate.now())||
                setpasswordpassfield.getText().isEmpty()||
                choosearolecombobox.getValue()==null
                ){
            Alert failtocreateaccAlert = new Alert(Alert.AlertType.ERROR);
            failtocreateaccAlert.setContentText("Fill up the form properly!");
            failtocreateaccAlert.show();
            failtocreateaccAlert.showAndWait();
            return;

        }


        boolean IDexists = false;
        int newid=Integer.parseInt(EnterIDtextbox.getText());
        for (User u : userList) {
            if (u.getId() == newid) { // or .equals() if Integer
                IDexists = true;
                break;
            }
        }
        if (IDexists) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("ID already exists!");
            errorAlert.showAndWait();
            return;
        }


            String password = setpasswordpassfield.getText();

            if (password.length()<8) {
                Alert PasserrorAlert = new Alert(Alert.AlertType.ERROR);
                PasserrorAlert.setContentText("Password must be exactly 8 characters long.");
                PasserrorAlert.showAndWait();
                return;
            }


            else{
                String gender="";
                if(maleradiobutton.isSelected())
                    gender="Male";
                else if (femaleradiobutton.isSelected())
                    gender="Female";

            userList.add(new User(Integer.parseInt(EnterIDtextbox.getText()),
                    fullnametextbox.getText(),
                    phonenumbertextbox1.getText(),
                    gender,
                    emailaddresstextbox.getText(),
                    setpasswordpassfield.getText(),
                    (String) choosearolecombobox.getValue(),
                    dateofbirthdatepicker.getValue()));
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setContentText("Account Created Successfully");
            successAlert.show();
                        fullnametextbox.clear();
                        phonenumbertextbox1.getText();
                        maleradiobutton.setSelected(false);
                        femaleradiobutton.setSelected(false);
                        emailaddresstextbox.clear();
                        setpasswordpassfield.clear();
                        dateofbirthdatepicker.setValue(null);


                File f = new File("UserRecord.bin");
                try{
                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;
                    if(f.exists()){
                        fos = new FileOutputStream(f, true);
                        oos = new appendableObjectOutStream(fos);
                    }
                    else{
                        fos = new FileOutputStream(f);
                        oos = new ObjectOutputStream(fos);
                    }

                    for(User u: userList){
                        oos.writeObject(u);
                    }
                    oos.close();
                }
                catch (IOException e){
                    //
                }

            }



        }

    }
