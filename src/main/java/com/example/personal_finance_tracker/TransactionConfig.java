package com.example.personal_finance_tracker;

import com.example.personal_finance_tracker.model.Transaction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class TransactionConfig {
    @Bean
    public List<Transaction> transactionList() {
        return new ArrayList<Transaction>();
    }
}
