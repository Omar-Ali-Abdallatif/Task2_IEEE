# Task2_IEEE
# 🏦 Bank & Shop System – IEEE Task 2

## 📌 Overview
This project demonstrates **Object-Oriented Programming (OOP) design** in Java through a simple banking and shopping system.  
It highlights **class design, encapsulation, validation, and interaction between objects**.

---

## 📂 Project Structure
```
src/
 ├── accounts/
 │    ├── BankAccount.java
 │    ├── BankAccountExample2.java
 │    ├── Customer.java
 │    └── Product.java
 └── app/
      ├── BankApp.java
      ├── BankAppExample2.java
      └── ShopApp.java

   ```   
---

## 🏦 Banking System Classes

### **BankAccount**
- Represents a user’s bank account.
- **Attributes:**
  - `accountHolder` → String (owner’s name)
  - `balance` → double (account balance)
  - `warningMessage` → final String (validation message)
- **Key Methods:**
  - `checkBalance(double balance)` → ensures balance is non-negative.
  - Getters/Setters for encapsulation.

✅ **Design Note:**  
Encapsulation is enforced by private fields and controlled setters. Negative balances are prevented via validation logic.

---

### **BankAccountExample2**
- Extended version of `BankAccount` with **transaction simulation**.
- **Attributes:**
  - `owner`, `balance`, `warningMessage`
- **Static Method:**
  - `sss(firstAccount, secondAccount, amount, transferNumber)` → simulates money transfer between accounts with transaction status.

✅ **Design Note:**  
Demonstrates **static utility methods** for handling transactions between multiple objects.

---

### **BankApp & BankAppExample2**
- Entry points for testing the banking system.
- Showcases:
  - Account creation
  - Balance updates
  - Transaction validation

---

## 🛒 Shopping System Classes

### **Customer**
- Represents a customer with:
  - `balance` → available money
  - `items` → number of purchased products
- **Method:**
  - `addProduct(Product product, Customer customer)` → checks stock & balance before purchase.

✅ **Design Note:**  
Encapsulation ensures customer state is updated only through controlled methods.

---

### **Product**
- Represents a product in the shop.
- **Attributes:**
  - `productName`, `price`, `inStock`
- **Methods:**
  - Getters/Setters for product details.

---

### **ShopApp**
- Demonstrates customer-product interaction:
  - Buying products
  - Stock validation
  - Balance deduction

---

## 🎯 Key OOP Concepts Demonstrated
- **Encapsulation** → private fields with getters/setters.
- **Validation** → preventing negative balances & invalid purchases.
- **Static Methods** → handling transactions between multiple accounts.
- **Object Interaction** → Customer ↔ Product, Account ↔ Account.

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone <repo-link>
2. Compile the project:
 - javac src/app/*.java src/accounts/*.java
3. Run examples:
 - java app.BankApp
  java app.BankAppExample2
  java app.ShopApp

 ## 📖 Conclusion
-This task emphasizes class design clarity and real-world simulation of banking and shopping systems.
It is a practical demonstration of Java OOP principles for IEEE projects.
You can copy-paste this directly into your `README.md` file on GitHub. It’s already formatted with Markdown for clean presentation.
_

