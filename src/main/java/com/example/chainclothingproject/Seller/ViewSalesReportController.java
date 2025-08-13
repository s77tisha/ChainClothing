package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ViewSalesReportController
{
    @javafx.fxml.FXML
    private TableColumn monthtablecolumnofMonthlysalestableview;
    @javafx.fxml.FXML
    private TableView topsellingproducttableview;
    @javafx.fxml.FXML
    private DatePicker Startdatedatepicker;
    @javafx.fxml.FXML
    private TableColumn UnitsoldcolumnofGoodSoldtableview;
    @javafx.fxml.FXML
    private TableColumn RevenueGeneratedcolumnofGoodSoldtableview;
    @javafx.fxml.FXML
    private TableColumn NoOfOrderstablecolumnofMonthlysalestableview;
    @javafx.fxml.FXML
    private TableColumn RevenuetablecolumnofMonthlysalestableview;
    @javafx.fxml.FXML
    private TableView Monthlysalestableview;
    @javafx.fxml.FXML
    private TableColumn ProductnamecolumnofGoodsSoldtableview;
    @javafx.fxml.FXML
    private DatePicker enddatdatepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void calculateYearlyRevenueonactionbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void gobacktodashboardonactionbuttonclick(ActionEvent actionEvent) {
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
    public void onactionFIlterbymonthbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void highestrevenueMonthonactionbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Mostsoldproductonactionbuttonclick(ActionEvent actionEvent) {
    }
}