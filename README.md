# Core Math Library (OOP Implementation)

## 📌 Project Overview
This project is a modular Core Math Library designed using **Object-Oriented Programming (OOP)** principles. [cite_start]It demonstrates the use of **Inheritance**, **Encapsulation**, and **Polymorphism** to organize mathematical operations into a logical class hierarchy[cite: 5, 12, 13].

## Class Hierarchy

### Level 1: The Grandparent (Base Class)
**`MathOperation`**
* **Key Responsibilities:**
    **Encapsulation:** Protects the `result` variable (private) to ensure data integrity

### Level 2: The Parents (Category Classes)
These classes group operations based on their specific input requirements

1.  **`ArithmeticOperation`** (Extends `MathOperation`)
    **Role:** Manages operations that require **two numerical inputs** (e.g., addition, division)
    **Responsibility:** Centralizes the storage of `operand1` and `operand2` so child classes don't duplicate code

2.  **`GeometryOperation`** (Extends `MathOperation`)
    **Role:** Manages shape-based calculations[cite: 47].
    **Responsibility:** Provides validation logic (e.g., `isValid()`) to ensure shape dimensions like radius or length are never negative

3.  **`NumberAnalysis`** (Extends `MathOperation`)
   *Role:** Manages operations that analyze a **single integer**
   *Responsibility:** Handles the storage and retrieval of the single `number` input

### Level 3: The Children (Concrete Tools)
These classes contain the specific formulas and logic for each operation[cite: 32].

* **Arithmetic:**
    * `Addition`, `Subtraction`, `Multiplication`.
    `Division`: Includes specific error handling for **Division by Zero** (sets result to 0.0 on error)
* **Geometry:**
    `Circle`: Calculates Area and Circumference
    `Rectangle`: Calculates Area and Perimeter
* **Number Analysis:**
    `PrimeCheck`: Determines if a number is prime using an optimized loop
    `Factorial`: Calculates the factorial
    `EvenOddCheck`: Uses the modulo operator (`%`) to determine parity

