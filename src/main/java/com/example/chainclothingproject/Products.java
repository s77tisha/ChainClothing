package com.example.chainclothingproject;

import java.io.Serializable;


public class Products implements Serializable {
    private int productid, price;
    private String productname, category, size, color, stockstatus, discountInfo;

    public Products() {
    }

    public Products(int productid, String productname, int price, String category, String size, String color, String stockstatus, String discountInfo) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
        this.category = category;
        this.size = size;
        this.color = color;
        this.stockstatus = stockstatus;
        this.discountInfo = discountInfo;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStockstatus() {
        return stockstatus;
    }

    public void setStockstatus(String stockstatus) {
        this.stockstatus = stockstatus;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productid=" + productid +
                ", price=" + price +
                ", productname='" + productname + '\'' +
                ", category='" + category + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", stockstatus='" + stockstatus + '\'' +
                ", discountInfo='" + discountInfo + '\'' +
                '}';
    }
}