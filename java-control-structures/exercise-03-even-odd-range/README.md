# Exercise 03 - Java Control Structures

## Description

Write a program that receives a first number, then receives a second number greater than the first one. After that, the user chooses whether to display even or odd numbers.

The program must display all even or odd numbers in the selected range, including the entered numbers when applicable, in descending order.

## Example

### Input

```text
Type a number: 3
Type a number greater than first number: 10
Type 1 to choose Even numbers or 2 to choose Odd numbers: 1
```

### Output

```text
Even numbers in the selected range: 10, 8, 6, 4.
```

## Another Example

### Input

```text
Type a number: 3
Type a number greater than first number: 10
Type 1 to choose Even numbers or 2 to choose Odd numbers: 2
```

### Output

```text
Odd numbers in the selected range: 9, 7, 5, 3.
```

## Project Structure

```text
exercise-03-even-odd-range/
├── src/
│   └── controlstructures/
│       └── exercise03/
│           ├── Main.java
│           └── EvenOddRange.java
└── README.md
```

## Technologies Used

- Java
- Scanner

## What I Practiced

- Creating classes in Java
- Reading user input with `Scanner`
- Working with variables
- Creating and calling methods
- Using conditional statements
- Using `do while` loops
- Using `for` loops
- Working with even and odd numbers
- Organizing code using packages
- Organizing code using separate classes

## Code Overview

The project contains two classes:

- `Main`: responsible for receiving the user's input, validating the second number, and calling the range generator.
- `EvenOddRange`: responsible for finding the correct starting number and displaying the selected even or odd numbers in descending order.
