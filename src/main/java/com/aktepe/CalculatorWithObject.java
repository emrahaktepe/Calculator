package com.aktepe;

public class CalculatorWithObject {
    // Square function
    public int Square(int num) {
        return num * num;
    }

    // Add two integers and returns the sum
    public int Add(int num1, int num2) {
        return num1 + num2;
    }

    // Add two integers and returns the sum
    public double Add(double num1, double num2) {
        return num1 + num2;
    }

    // Multiply two integers and returns the result
    public int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int Divide(int num1, int num2) {
        if (num2 == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return num1 / num2;
    }

    // Subtracts small number from big number
    public int Subtract(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        }
        return num2 - num1;
    }
}
