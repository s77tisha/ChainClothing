package com.example.chainclothingproject.Accountant;

import java.time.LocalDate;

public class ExpensesTracker1 {
    private String vendorname;
    private int amount;

    public ExpensesTracker1(String vendorname, int amount) {
        this.vendorname = vendorname;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    @Override
    public String toString() {
        return "ExpensesTracker1{" +
                "vendorname='" + vendorname + '\'' +
                ", amount=" + amount +
                '}';
    }
}