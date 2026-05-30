# 🚀 Recursion In Java - Advanced Level

A collection of advanced recursion problems implemented in Java to strengthen problem-solving skills, understand recursive thinking, and master backtracking techniques.

This repository covers some of the most important recursion patterns frequently asked in coding interviews and competitive programming.

---

## 📚 Topics Covered

* Recursive Backtracking
* Subset Generation
* String Permutations
* Recursive Counting Problems
* Maze Path Counting
* Pairing & Arrangement Problems
* Tiling Problems

---

## 📂 Problems Implemented

### 1️⃣ Print All Subsets of First N Natural Numbers

**File:** `AllSubsets.java`

Generate all possible subsets of the first `n` natural numbers using recursion and backtracking.

#### Example

Input:

```java
n = 3
```

Output:

```text
321
32
31
3
21
2
1
```

**Concepts Used**

* Recursion
* Backtracking
* Include/Exclude Pattern

---

### 2️⃣ Call The Guests

**File:** `CallTheGuests.java`

Find the total number of ways to invite `n` guests where each guest can either attend:

* Individually
* As part of a pair

#### Example

Input:

```java
n = 4
```

Output:

```text
10
```

#### Recurrence Relation

```text
f(n) = f(n-1) + (n-1) × f(n-2)
```

**Concepts Used**

* Combinatorics
* Recursive Counting
* Pairing Problems

---

### 3️⃣ Count Paths in a Maze

**File:** `CountPaths.java`

Count the number of possible paths from the top-left corner `(0,0)` to the bottom-right corner `(n-1,m-1)`.

#### Allowed Moves

* Right ➡️
* Down ⬇️

#### Example

Input:

```java
n = 3
m = 3
```

Output:

```text
6
```

**Concepts Used**

* Grid Traversal
* Recursive Path Counting
* Dynamic Programming Foundation

---

### 4️⃣ Print All String Permutations

**File:** `Permutations.java`

Generate all possible permutations of a given string using recursion.

#### Example

Input:

```java
"abc"
```

Output:

```text
abc
acb
bac
bca
cab
cba
```

**Concepts Used**

* Backtracking
* String Manipulation
* Recursive Branching

---

### 5️⃣ Tile Placement Problem

**File:** `TilePlacements.java`

Find the number of ways to place tiles of size `1 × m` on a floor of size `n × m`.

#### Example

Input:

```java
n = 4
m = 2
```

Output:

```text
5
```

**Concepts Used**

* Recursive Counting
* Tiling Problems
* Dynamic Programming Foundation

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming
* Recursion
* Backtracking

---

## ▶️ How to Run

### Clone the Repository

```bash
git clone https://github.com/your-username/Recursion-In-Java-Advanced-Level.git
```

### Navigate to Project Directory

```bash
cd Recursion-In-Java-Advanced-Level
```

### Compile a Java File

```bash
javac FileName.java
```

### Run the Program

```bash
java FileName
```

---

## 🎯 What You Will Learn

By working through these examples, you will gain a deeper understanding of:

* Recursive function design
* Recursive call stack behavior
* Backtracking algorithms
* Combinatorial recursion
* Problem decomposition
* Foundations of Dynamic Programming

---

## 🔥 Future Enhancements

Some additional recursion and backtracking problems that can be added:

* Tower of Hanoi
* N-Queens Problem
* Sudoku Solver
* Rat in a Maze
* Generate Parentheses
* Josephus Problem
* Word Search

---

## 🤝 Contributing

Contributions are welcome!

If you have optimized solutions, additional recursion problems, or improvements, feel free to fork the repository and create a pull request.

---

## ⭐ Support

If you found this repository helpful for learning recursion and interview preparation, please consider giving it a **Star ⭐**.

Happy Coding! 🚀
