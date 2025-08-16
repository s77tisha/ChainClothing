package com.example.chainclothingproject.Seller;

import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ViewSalesReportController
{
    @javafx.fxml.FXML
    private DatePicker Startdatedatepicker;
    @javafx.fxml.FXML
    private DatePicker enddatdatepicker;
    @javafx.fxml.FXML
    private TableView RevenueTableView;
    @javafx.fxml.FXML
    private TableColumn ProductNameColumnTopsellingTableview;
    @javafx.fxml.FXML
    private TableColumn orderIDcolumnTopsellingTableview;
    @javafx.fxml.FXML
    private TableColumn quantityColumnTopSellingTableView;
    @javafx.fxml.FXML
    private TableColumn subtotalColumnOfSalerecordTableView;
    @javafx.fxml.FXML
    private TableColumn revenueColumnRevenueTableView;
    @javafx.fxml.FXML
    private TableView TopSellingTableView;
    @javafx.fxml.FXML
    private TableView SaleRecordTableView;
    @javafx.fxml.FXML
    private Label ShowTopSellingProduct;
    @javafx.fxml.FXML
    private Button loadEachMonthRevenueInTableView;
    @javafx.fxml.FXML
    private TableColumn OrderDateColumnOfSalerecordtableView;
    @javafx.fxml.FXML
    private TableColumn OrderIDColumnOfSalerecordTable;
    @javafx.fxml.FXML
    private TableColumn MonthColumnRevenuetableView;
    @javafx.fxml.FXML
    private Label ShowHighestRevenueMonthLabel;
    @javafx.fxml.FXML
    private Label ShowrevenueofAMonthLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
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

    @Deprecated
    public void Mostsoldproductonactionbuttonclick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShowallREvenueOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadsalerecordOnactionbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void TopSellingProductOnactionButton(ActionEvent actionEvent) {
    }
}