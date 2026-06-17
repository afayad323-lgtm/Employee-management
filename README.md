# 💼 Employee Management System (Java OOP Project)

A simple console-based Employee Management System built using Java OOP principles.  
The project demonstrates core Object-Oriented Programming concepts and basic system design using a layered architecture.

---

## 🚀 Features

- Add Employees (Salaried, Hourly, Manager)
- Delete Employee by ID
- Update Employee Salary
- Search Employee by ID
- Print Employee Details
- Generate Reports:
  - Total Payroll
  - Average Salary
  - Filter by Employee Type
- Console-based Menu System

---

## 🧠 Concepts Used

This project is built to practice and understand:

- Object-Oriented Programming (OOP)
  - Encapsulation
  - Inheritance
  - Polymorphism
  - Abstraction
- Interfaces (Payable concept if applied)
- Enums (Department, EmployeeType)
- Collections (ArrayList)
- Method Overriding
- Service Layer Design (Separation of Concerns)

---
## 🏗️ Project Structure

Employee System
│
├── Main.java # Entry point (Menu system)
├── Employee.java # Abstract base class
├── Manager.java # Employee type
├── SalariedEmployee.java # Employee type
├── HourlyEmployee.java # Employee type
│
├── EmployeeService.java # Business logic (CRUD + Reports)
│
├── Department.java # Enum
└── EmployeeType.java # Enum


---

📊 Example Output

Total Payroll: 15000.0
Total Employees: 3
Average Salary: 5000.0

ID: 1
NAME: Ahmed
DEPART: HR
SALARY: 5000
TOTAL SALARY: 5200

---

🎯 Learning Goals

This project helps you understand:

How real systems are structured in Java
How to separate logic into layers
How OOP is used in real backend systems
How to prepare for Spring Boot development
