/*
 * Copyright 2008 Inc.
 *
 * (details of open-source license...)
 */


package thoughtworks.model;


import thoughtworks.tool.OperationFactory;

public class Calculator {

    private double firstNumber = 0;
    private char operation = '+';
    private double secondNumber = 0;

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        return OperationFactory.calculate(firstNumber, secondNumber, operation);
    }
}
