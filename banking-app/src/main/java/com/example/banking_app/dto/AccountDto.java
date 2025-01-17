package com.example.banking_app.dto;

import lombok.*;


public class AccountDto {
    private Long id;
    private String accountName;
    private double balance;

    public AccountDto(Long id, String accountName, double balance) {
        this.id = id;
        this.accountName = accountName;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
