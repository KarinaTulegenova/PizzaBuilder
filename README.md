# 🍕 Pizza Builder — Builder Design Pattern in Java
<img width="690" height="361" alt="image" src="https://github.com/user-attachments/assets/02232650-cc0b-4910-afdb-bf052472c362" />

## 📌 Project Overview

This project demonstrates the implementation of the **Builder design pattern** using a simple and clear example — building a **Pizza** object in Java.

The main goal of the project is to show how the Builder pattern helps create complex objects **step by step**, avoiding constructors with many confusing parameters and making the code more readable, flexible, and maintainable.

---

## 🧠 Why Builder Pattern?

When an object has many optional parameters, traditional constructors can become:
- hard to read
- difficult to maintain
- error-prone

The **Builder pattern** solves this problem by:
- separating object construction from its representation
- allowing fluent (chainable) method calls
- making object creation clear and expressive

---

## ✅ Key Features

- 🍕 Step-by-step creation of a `Pizza` object
- 🧩 Clear separation between construction and final object
- ✨ Fluent interface for better readability
- ♻️ Easy to extend with new options without breaking existing code
- 📚 Beginner-friendly example of the Builder pattern

---

## 🧱 Project Structure

```text
├── Pizza.java          # Final product class
├── PizzaBuilder.java   # Builder with configurable options
├── Main.java           # Example usage of the Builder
└── README.md           # Project documentation
