package com.example.chainclothingproject.Accountant;

import java.time.LocalDate;

public class PettycashTracker {
    private LocalDate date;
    private String Catagory;
    private String amount;

    public PettycashTracker(LocalDate date, String catagory, String amount) {
        this.date = date;
        Catagory = catagory;
        this.amount = amount;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String catagory) {
        Catagory = catagory;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PettycashTracker{" +
                "date=" + date +
                ", Catagory='" + Catagory + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
