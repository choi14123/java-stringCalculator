package org.example.stringcalculator.model;

public class FourBasicOperation {

    public int fourOperations(int number, int number1, String operator) {
        if (operator.equals("+")) {
            return number + number1;
        }
        if (operator.equals("-")) {
            return number - number1;
        }
        if (operator.equals("/")) {
            return number / number1;
        }
        if (operator.equals("*")) {
            return number * number1;
        }

        return number;
    }
}