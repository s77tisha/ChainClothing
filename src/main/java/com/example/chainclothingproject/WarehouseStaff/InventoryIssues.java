package com.example.chainclothingproject.WarehouseStaff;

public class InventoryIssues {
    private int ProductID,Quantity;
    private String Issues;



    public InventoryIssues() {
    }

    public InventoryIssues(int productID, int quantity, String issues) {
        ProductID = productID;
        Quantity = quantity;
        Issues = issues;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getIssues() {
        return Issues;
    }

    public void setIssues(String issues) {
        Issues = issues;
    }

    @Override
    public String toString() {
        return "InventoryIssues{" +
                "ProductID=" + ProductID +
                ", Quantity=" + Quantity +
                ", Issues='" + Issues + '\'' +
                '}';
    }
}



