package org.example.stringcalculator.model;

public class FourBasicOperation {
    private static final String EXCEPTION_MESSAGE = "나누기에는 0이 입력되면 안됩니다.";

    public int getTotalResultNumber(int number, int number1, String operator) {
        if (operator.equals("+")) {
            return number + number1;
        }
        if (operator.equals("-")) {
            return number - number1;
        }
        if (operator.equals("/")) {
            validateCheckNumberZero(number1);
            return number / number1;
        }
        if (operator.equals("*")) {
            return number * number1;
        }
        return number;
    }

    private void validateCheckNumberZero(int number1) {
        if (number1 == 0) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE);
        }
    }
}