# 💰 Personal Finance Tracker (Transaction Management API)

## 🧩 Overview

The **Personal Finance Tracker** is a simple **RESTful API** built using **Java Spring Boot**.  
It helps manage personal financial transactions including creating, reading, updating, and deleting transaction records.  
The project uses an **in-memory data store (List)** and the **Java Stream API** for efficient data retrieval and manipulation.

---

## 🎯 Features

### ✅ Basic Endpoints
| Method | Endpoint | Description |
|---------|-----------|-------------|
| `GET` | `/api/transactions` | Get all transaction history |
| `GET` | `/api/transactions/{id}` | Get a specific transaction by ID |
| `POST` | `/api/transactions` | Add a new transaction |
| `PUT` | `/api/transactions/{id}` | Update an existing transaction |
| `DELETE` | `/api/transactions/{id}` | Delete a transaction by ID |

### 💡 Advanced Endpoint (Optional Task - Completed)
| Method | Endpoint | Description |
|---------|-----------|-------------|
| `GET` | `/api/transactions?type=income` | Get transactions filtered by type (e.g., `income` or `expense`) using Java Stream API |

---

## ⚙️ Technologies Used

- **Java 25**
- **Spring Boot 3**
- **Spring Web**
- **Java Stream API**
- **Gradle**
- **Lombok** (for cleaner code)
- **In-Memory List Storage**

---

## 🏗️ Project Structure

```

transaction-api/
├── src/
│   ├── main/
│   │   ├── java/com/example/transactionapi/
│   │   │   ├── PersonalFinanceTrackerApp.java
│   │   │   ├── controller/TransactionController.java
│   │   │   ├── model/Transaction.java
│   │   │   └── TransactionConfig.java
│   │   └── resources/
│   │       └── application.properties
└── build.gradle

````

---

## 📦 How to Run the Project

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/nNEWBE/personal-finance-tracker-api.git
cd personal-finance-tracker-api
````

### 2️⃣ Build the Project

```bash
./gradlew build
```

### 3️⃣ Run the Application

```bash
./gradlew bootRun
```

### 4️⃣ Access the API

The application will run by default at:

```
http://localhost:8080/api/transactions
```

---

## 🧪 Example API Requests

### ➕ Add a New Transaction (POST)

**Endpoint:**

```
POST /api/transactions
```

**Request Body:**

```json
{
  "type": "income",
  "amount": 5000,
  "description": "Freelance project payment"
}
```

---

### 📋 Get All Transactions (GET)

```
GET /api/transactions
```

---

### 🔍 Get Transaction by ID (GET)

```
GET /api/transactions/1
```

---

### ✏️ Update Transaction (PUT)

```
PUT /api/transactions/1
```

**Request Body:**

```json
{
  "type": "expense",
  "amount": 2500,
  "description": "Updated expense for groceries"
}
```

---

### ❌ Delete Transaction (DELETE)

```
DELETE /api/transactions/1
```

---

### 🔎 Filter by Type (GET)

```
GET /api/transactions?type=income
```

**Response Example:**

```json
[
  { "id": 1, "type": "income", "amount": 50000, "description": "Salary" },
  { "id": 3, "type": "income", "amount": 12000, "description": "Freelance project" }
]
```

---

## 🧠 Sample Test Data

Here are 5 sample records you can use for POST requests:

```json
[
  { "id": 1, "type": "income", "amount": 50000, "description": "Monthly salary deposit" },
  { "id": 2, "type": "expense", "amount": 3500, "description": "Grocery shopping" },
  { "id": 3, "type": "income", "amount": 12000, "description": "Freelance web project" },
  { "id": 4, "type": "expense", "amount": 2500, "description": "Utility bill" },
  { "id": 5, "type": "expense", "amount": 800, "description": "Transport pass" }
]
```

---

## 🧩 Learning Highlights

* Built a complete REST API from scratch using **Spring Boot**
* Implemented **CRUD operations** using **List** as the data store
* Used **Java Stream API** for data filtering and manipulation
* Practiced **controller-service-model** architecture for clean design
* Gained deeper understanding of RESTful endpoints

---

## 🏁 Conclusion

This project demonstrates the implementation of a **Spring Boot RESTful API** using core Java concepts and stream processing.
It serves as a foundation for understanding **data manipulation**, **API design**, and **Spring Boot architecture**.

---
