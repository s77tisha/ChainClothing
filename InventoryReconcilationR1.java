package com.example.chainclothingproject.Accountant;

import java.time.LocalDate;

public class InventoryReconcilationR1 {
    private LocalDate date;
    private Integer ProductId;
    private Integer Amount;

    public InventoryReconcilationR1(LocalDate date, Integer productId, Integer amount) {
        this.date = date;
        ProductId = productId;
        Amount = amount;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer productId) {
        ProductId = productId;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "InventoryReconcilationR1{" +
                "date=" + date +
                ", ProductId=" + ProductId +
                ", Amount=" + Amount +
                '}';
    }
}


