# Exercise 02 - Java Control Structures

## Description

Write a program that receives the user's height in meters and weight in kilograms, calculates their BMI, and displays the BMI value with two decimal places and its classification.

```text
BMI = weight / (height * height)
```

## BMI Classification

```text
BMI <= 18.5: Underweight
BMI <= 24.9: Ideal weight
BMI <= 29.9: Slightly overweight
BMI <= 34.9: Obesity Class I
BMI <= 39.9: Obesity Class II (Severe)
BMI >= 40.0: Obesity Class III (Morbid)
```

## Example

### Input

```text
Type your height in meters: 1.66
Type your weight in kg: 85
```

### Output

```text
Your BMI is: 30.85
Classification: Obesity Class I
```

## Project Structure

```text
exercise-02-bmi-calculator/
├── src/
│   └── controlstructures/
│       └── exercise02/
│           ├── Main.java
│           └── BmiCalculator.java
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
- Performing mathematical calculations
- Formatting decimal numbers with `printf`
- Organizing code using packages
- Organizing code using separate classes

## Code Overview

The project contains two classes:

- `Main`: responsible for receiving the user's input, calling the BMI calculator, and displaying the result.
- `BmiCalculator`: responsible for calculating the BMI and classifying the result.

## Code Notes

The BMI value is displayed with two decimal places using `System.out.printf`.

```java
System.out.printf("Your BMI is: %.2f%n", bmi);
```
