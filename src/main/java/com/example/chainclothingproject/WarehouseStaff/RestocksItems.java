package com.example.chainclothingproject.WarehouseStaff;

public class RestocksItems {
    private int ProductID,Quantity,ReturnedProductID,TotalReturned;
    private  String Quality,Status;

    public RestocksItems() {
    }

    public RestocksItems(int productID, int quantity, int returnedProductID, int totalReturned, String quality, String status) {
        ProductID = productID;
        Quantity = quantity;
        ReturnedProductID = returnedProductID;
        TotalReturned = totalReturned;
        Quality = quality;
        Status = status;
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

    public int getReturnedProductID() {
        return ReturnedProductID;
    }

    public void setReturnedProductID(int returnedProductID) {
        ReturnedProductID = returnedProductID;
    }

    public int getTotalReturned() {
        return TotalReturned;
    }

    public void setTotalReturned(int totalReturned) {
        TotalReturned = totalReturned;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String quality) {
        Quality = quality;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "RestocksItems{" +
                "ProductID=" + ProductID +
                ", Quantity=" + Quantity +
                ", ReturnedProductID=" + ReturnedProductID +
                ", TotalReturned=" + TotalReturned +
                ", Quality='" + Quality + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
