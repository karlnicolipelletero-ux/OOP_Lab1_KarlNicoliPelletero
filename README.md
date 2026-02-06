# OOP_Lab1_KarlNicoliPelletero

This is the activity of Karl Nicoli S. Pelletero, to be submitted by Engr. Jamie Rosal.


# Core Math Library (OOP Implementation)

## 📌 Project Overview
This project is a modular Core Math Library designed using **Object-Oriented Programming (OOP)** principles. [cite_start]It demonstrates the use of **Inheritance**, **Encapsulation**, and **Polymorphism** to organize mathematical operations into a logical class hierarchy[cite: 5, 12, 13].

## Class Hierarchy

### Level 1: The Grandparent (Base Class)
**`MathOperation`**
* [cite_start]**Role:** The root class that enforces a standard contract for all mathematical tools[cite: 15, 16].
* **Key Responsibilities:**
    * [cite_start]**Encapsulation:** Protects the `result` variable (private) to ensure data integrity[cite: 20].
    * [cite_start]**Abstraction:** Defines the abstract `calculate()` method, forcing every child class to implement its own logic[cite: 19].

### Level 2: The Parents (Category Classes)
[cite_start]These classes group operations based on their specific input requirements[cite: 27].

1.  **`ArithmeticOperation`** (Extends `MathOperation`)
    * [cite_start]**Role:** Manages operations that require **two numerical inputs** (e.g., addition, division)[cite: 37].
    * [cite_start]**Responsibility:** Centralizes the storage of `operand1` and `operand2` so child classes don't duplicate code[cite: 44].

2.  **`GeometryOperation`** (Extends `MathOperation`)
    * [cite_start]**Role:** Manages shape-based calculations[cite: 47].
    * [cite_start]**Responsibility:** Provides validation logic (e.g., `isValid()`) to ensure shape dimensions like radius or length are never negative[cite: 53].

3.  **`NumberAnalysis`** (Extends `MathOperation`)
    * [cite_start]**Role:** Manages operations that analyze a **single integer**[cite: 55].
    * [cite_start]**Responsibility:** Handles the storage and retrieval of the single `number` input[cite: 61, 62].

### Level 3: The Children (Concrete Tools)
[cite_start]These classes contain the specific formulas and logic for each operation[cite: 32].

* **Arithmetic:**
    * `Addition`, `Subtraction`, `Multiplication`.
    * [cite_start]`Division`: Includes specific error handling for **Division by Zero** (sets result to 0.0 on error)[cite: 120, 125].
* **Geometry:**
    * [cite_start]`Circle`: Calculates Area ($\pi r^2$) and Circumference[cite: 49].
    * [cite_start]`Rectangle`: Calculates Area ($l \times w$) and Perimeter[cite: 50].
* **Number Analysis:**
    * [cite_start]`PrimeCheck`: Determines if a number is prime using an optimized loop[cite: 57].
    * `Factorial`: Calculates $n!$, handling edge cases like $0! [cite_start]= 1$[cite: 58].
    * [cite_start]`EvenOddCheck`: Uses the modulo operator (`%`) to determine parity[cite: 59].

