package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import com.example.chainclothingproject.Products;
import com.example.chainclothingproject.appendableObjectOutStream;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.*;
import java.util.ArrayList;

public class DeleteProductContoller
{

    @javafx.fxml.FXML
    private TableView<Products> Editproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn<Products,String> productIDcolumnofEditproductlisttableview;
    @javafx.fxml.FXML
    private TableColumn<Products,String> priceofEditproductlisttableview2;
    @javafx.fxml.FXML
    private TableColumn <Products,String>StockStatuscolumnofEditproductlisttableview21;
    @javafx.fxml.FXML
    private TextField ProductIDtodeleteTextfield;
    @javafx.fxml.FXML
    private TableColumn <Products,String>productNamecolumnofEditproductlisttableview1;
    @javafx.fxml.FXML
    private TableColumn <Products,String>DiscountStatusofEditproductlisttableview211;

    private ObservableList<Products> productList;
    @javafx.fxml.FXML
    public void initialize() {
        productIDcolumnofEditproductlisttableview.setCellValueFactory(new PropertyValueFactory<Products, String>("productid"));
        priceofEditproductlisttableview2.setCellValueFactory(new PropertyValueFactory<Products, String>("price"));
        productNamecolumnofEditproductlisttableview1.setCellValueFactory(new PropertyValueFactory<Products, String>("productname"));
        StockStatuscolumnofEditproductlisttableview21.setCellValueFactory(new PropertyValueFactory<Products, String>("stockstatus"));
        DiscountStatusofEditproductlisttableview211.setCellValueFactory(new PropertyValueFactory<Products, String>("discountInfo"));

    }


    @javafx.fxml.FXML
    public void GobackToDashboardOnActionButton(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void deleteproductFromPlateformonbuttonclick(ActionEvent actionEvent) {

        String idText = ProductIDtodeleteTextfield.getText();

        if (idText.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please enter a Product ID to delete!");
            alert.showAndWait();
            return;
        }

        int productIdToDelete = Integer.parseInt(idText);

        File f = new File("ProductRecord.bin");
        ArrayList<Products> tempproductList = new ArrayList<>();


        if (f.exists()) {
            try (FileInputStream fis = new FileInputStream(f);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (true) {
                    try {
                        Products p = (Products) ois.readObject();
                        tempproductList.add(p);
                    } catch (Exception e) {
                        break;
                    }
                }
            } catch (Exception e) {

            }
        }


        boolean removed = tempproductList.removeIf(p ->p.getProductid()==productIdToDelete  );

        if (removed) {

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

                for (Products p : tempproductList) {
                    oos.writeObject(p);
                }
                oos.close();
            } catch (Exception e) {

            }



            ObservableList<Products> productObservableList = FXCollections.observableArrayList(tempproductList);
            Editproductlisttableview.setItems(productObservableList);

            Alert successAlert = new Alert(Alert.AlertType.CONFIRMATION);
            successAlert.setContentText("Product deleted successfully!");
            successAlert.show();
        }

        ProductIDtodeleteTextfield.clear(); // clear the input
    }



    @javafx.fxml.FXML
    public void loadProductlistonactionbutton(ActionEvent actionEvent) {
        File f = new File("ProductRecord.bin");


        ObservableList<Products> productObservableList = FXCollections.observableArrayList();

        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Products p = (Products) ois.readObject();
                    productObservableList.add(p);
                } catch (Exception e) {
                    break; // reached end of file
                }
            }
        } catch (Exception e) {
            //
        }

        Editproductlisttableview.setItems(productObservableList);
    }
    }

