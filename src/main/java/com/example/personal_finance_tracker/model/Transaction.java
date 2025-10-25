package com.example.personal_finance_tracker.model;

import lombok.Data;

@Data
public class Transaction {
    private Long id;
    private String type;
    private double amount;
    private String description;
}
