package org.example.stringcalculator.model;

public class FourOperations {
    private int result;

    public FourOperations(int number, int number1, String operator) {
        this.result = fourOperations(number, number1, operator);
    }

    private int fourOperations(int number, int number1, String operator) {
        if (operator.equals("+")) {
            result = number + number1;
        }
        if (operator.equals("-")) {
            result = number - number1;
        }
        if (operator.equals("/")) {
            result = number / number1;
        }
        if (operator.equals("*")) {
            result = number * number1;
        }
        return result;
    }

    public int getResult() {
        return result;
    }
}