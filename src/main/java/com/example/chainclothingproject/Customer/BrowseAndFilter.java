package com.example.chainclothingproject.Customer;

public class BrowseAndFilter {
    private String name;
    private Integer id;
    private Integer price;
    private float size;
    private String availability;
    private String brand;
    private float discount;

    public BrowseAndFilter(String name, Integer id, Integer price, float size, String availability, String brand, float discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.size = size;
        this.availability = availability;
        this.brand = brand;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "BrowseAndFilter{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", size=" + size +
                ", availability='" + availability + '\'' +
                ", brand='" + brand + '\'' +
                ", discount=" + discount +
                '}';
    }
}
