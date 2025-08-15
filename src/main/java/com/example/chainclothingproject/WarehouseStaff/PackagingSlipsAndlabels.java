package com.example.chainclothingproject.WarehouseStaff;

public class PackagingSlipsAndlabels {
    private int Quantity,TotalPrice;
    private String ProductName;

    public PackagingSlipsAndlabels() {
    }

    public PackagingSlipsAndlabels(int quantity, int totalPrice, String productName) {
        Quantity = quantity;
        TotalPrice = totalPrice;
        ProductName = productName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    @Override
    public String toString() {
        return "PackagingSlipsAndlabels{" +
                "Quantity=" + Quantity +
                ", TotalPrice=" + TotalPrice +
                ", ProductName='" + ProductName + '\'' +
                '}';
    }
}
