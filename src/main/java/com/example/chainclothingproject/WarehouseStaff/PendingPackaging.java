package com.example.chainclothingproject.WarehouseStaff;

import java.time.LocalDate;

public class PendingPackaging {
    private int OrderID,Price,Quantity;
    private String Status;
    private LocalDate DeliveryDate;

    public PendingPackaging() {
    }

    public PendingPackaging (int orderID, int price, int quantity, String status, LocalDate deliveryDate) {
        OrderID = orderID;
        Price = price;
        Quantity = quantity;
        Status = status;
        DeliveryDate = deliveryDate;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "PendingPackaging{" +
                "OrderID=" + OrderID +
                ", Price=" + Price +
                ", Quantity=" + Quantity +
                ", Status='" + Status + '\'' +
                ", DeliveryDate=" + DeliveryDate +
                '}';
    }
}
