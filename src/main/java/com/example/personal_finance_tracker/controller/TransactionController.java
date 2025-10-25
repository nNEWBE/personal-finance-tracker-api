package com.example.personal_finance_tracker.controller;

import com.example.personal_finance_tracker.model.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final List<Transaction> transactions;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        transactions.add(transaction);
        return ResponseEntity.ok(transaction);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Long id) {
        Transaction transaction = transactions.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
        return ResponseEntity.ok(transaction);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> updateTransaction(@PathVariable Long id, @RequestBody Transaction transaction) {
        Transaction existingTransaction = transactions.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (existingTransaction == null) {
            return ResponseEntity.notFound().build();
        }
        existingTransaction.setDescription(transaction.getDescription());
        existingTransaction.setAmount(transaction.getAmount());
        existingTransaction.setType(transaction.getType());
        return ResponseEntity.ok(existingTransaction);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Transaction> deleteTransaction(@PathVariable Long id) {
        Transaction transaction = transactions.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (transaction == null) {
            return ResponseEntity.notFound().build();
        }
        transactions.remove(transaction);
        return ResponseEntity.ok(transaction);
    }

    @GetMapping(params = "type")
    public ResponseEntity<List<Transaction>> getTransactionsByType(@RequestParam String type) {
        List<Transaction> filteredTransactions = transactions.stream()
                .filter(t -> t.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
        return ResponseEntity.ok(filteredTransactions);
    }
}
