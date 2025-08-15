package com.example.chainclothingproject.WarehouseStaff;

public class Inventoryview {
    private int ProductID,PhysicalStockEntries,UpdatedStockEntries;
    private String ProductName;



    public Inventoryview() {
    }

    public Inventoryview(int productID, int physicalStockEntries, int updatedStockEntries, String productName) {
        ProductID = productID;
        PhysicalStockEntries = physicalStockEntries;
        UpdatedStockEntries = updatedStockEntries;
        ProductName = productName;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getPhysicalStockEntries() {
        return PhysicalStockEntries;
    }

    public void setPhysicalStockEntries(int physicalStockEntries) {
        PhysicalStockEntries = physicalStockEntries;
    }

    public int getUpdatedStockEntries() {
        return UpdatedStockEntries;
    }

    public void setUpdatedStockEntries(int updatedStockEntries) {
        UpdatedStockEntries = updatedStockEntries;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    @Override
    public String toString() {
        return "Inventoryview{" +
                "ProductID=" + ProductID +
                ", PhysicalStockEntries=" + PhysicalStockEntries +
                ", UpdatedStockEntries=" + UpdatedStockEntries +
                ", ProductName='" + ProductName + '\'' +
                '}';
    }
}
