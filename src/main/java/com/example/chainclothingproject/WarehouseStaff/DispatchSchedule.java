package com.example.chainclothingproject.WarehouseStaff;

public class DispatchSchedule {

    private int ProductID,OrderID;
    private  String Status,DeliveryAssigned;

    public DispatchSchedule() {
    }

    public DispatchSchedule(int productID, int orderID, String status, String deliveryAssigned) {
        ProductID = productID;
        OrderID = orderID;
        Status = status;
        DeliveryAssigned = deliveryAssigned;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDeliveryAssigned() {
        return DeliveryAssigned;
    }

    public void setDeliveryAssigned(String deliveryAssigned) {
        DeliveryAssigned = deliveryAssigned;
    }

    @Override
    public String toString() {
        return "DispatchSchedule{" +
                "ProductID=" + ProductID +
                ", OrderID=" + OrderID +
                ", Status='" + Status + '\'' +
                ", DeliveryAssigned='" + DeliveryAssigned + '\'' +
                '}';
    }
}
