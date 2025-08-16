package com.example.chainclothingproject.WarehouseStaff;

public class StockOverview {

    private int ProductID,StockBelowBelt,EnoughStock;

    public StockOverview() {
    }

    public StockOverview(int productID, int stockBelowBelt, int enoughStock) {
        ProductID = productID;
        StockBelowBelt = stockBelowBelt;
        EnoughStock = enoughStock;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getStockBelowBelt() {
        return StockBelowBelt;
    }

    public void setStockBelowBelt(int stockBelowBelt) {
        StockBelowBelt = stockBelowBelt;
    }

    public int getEnoughStock() {
        return EnoughStock;
    }

    public void setEnoughStock(int enoughStock) {
        EnoughStock = enoughStock;
    }

    @Override
    public String toString() {
        return "StockOverview{" +
                "ProductID=" + ProductID +
                ", StockBelowBelt=" + StockBelowBelt +
                ", EnoughStock=" + EnoughStock +
                '}';
    }
}
