package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import com.example.chainclothingproject.Products;
import com.example.chainclothingproject.User;
import com.example.chainclothingproject.appendableObjectOutStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class AddProductController
{
    @javafx.fxml.FXML
    private TextField brandtextbox;
    @javafx.fxml.FXML
    private TextField sizetextbox;
    @javafx.fxml.FXML
    private ComboBox <String>categorycombobox;
    @javafx.fxml.FXML
    private TextField EnterproductIDtextbox;
    @javafx.fxml.FXML
    private TextField Enterproductnametextbox;
    @javafx.fxml.FXML
    private TextField pricetextbox;
    @javafx.fxml.FXML
    private TextField stockstatustextbox;
    @javafx.fxml.FXML
    private TextField discountInformation;




    @javafx.fxml.FXML
    public void initialize() {

        categorycombobox.getItems().addAll("Men","Women","Shoes","Bags","Accessories");
    }

    @javafx.fxml.FXML
    public void saveproductonactionbutton(ActionEvent actionEvent) {

        File f = new File("ProductRecord.bin");
        ArrayList<Products> productList = new ArrayList<>();

// 1️⃣ Load existing products
        if(f.exists()){
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                while(true){
                    try {
                        Products p = (Products) ois.readObject();
                        productList.add(p);
                    } catch (EOFException eof) {
                        break;
                    }
                }
            } catch (Exception e){

            }
        }

        boolean productIdexists = false;
        int newPid = Integer.parseInt(EnterproductIDtextbox.getText());
        for (Products p : productList) {
            if (p.getProductid() == newPid) {
                productIdexists = true;
                break;
            }
        }
        if (productIdexists) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Product ID already exists!");
            errorAlert.showAndWait();
            return;
        }

        productList.add(new Products(Integer.parseInt(EnterproductIDtextbox.getText()),
                Enterproductnametextbox.getText(),
                Integer.parseInt(pricetextbox.getText()),
                (String) categorycombobox.getValue(),
                sizetextbox.getText(),
                brandtextbox.getText(),
                stockstatustextbox.getText(),
                discountInformation.getText()));
        Alert successAlert = new Alert(Alert.AlertType.CONFIRMATION);
        successAlert.setContentText("Product Added");
        successAlert.show();

        Enterproductnametextbox.clear();
        pricetextbox.clear();
        brandtextbox.clear();
        sizetextbox.clear();
        stockstatustextbox.clear();
        discountInformation.clear();





        try {
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new appendableObjectOutStream(fos);
            } else {

                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Products p : productList) {
                oos.writeObject(p);
            }

            oos.close();
        } catch (IOException e) {
            //
        }


    }




    @javafx.fxml.FXML
    public void goBackToDashboardOnactionButton(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Seller/SellerDashboard.fxml"));
            Scene Nextscene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Seller Dashboard View");
            nextStage.setScene(Nextscene);
            nextStage.show();

        }
        catch (Exception e){
            //
        }
    }
}