package com.example.chainclothingproject.Accountant;

import java.time.LocalDate;

public class dailySales1 {
    private LocalDate date;
    private String Store;
    private int TotalSales;

    public dailySales1(LocalDate date, String store, int totalSales) {
        this.date = date;
        Store = store;
        TotalSales = totalSales;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStore() {
        return Store;
    }

    public void setStore(String store) {
        Store = store;
    }

    public int getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(int totalSales) {
        TotalSales = totalSales;
    }
}
