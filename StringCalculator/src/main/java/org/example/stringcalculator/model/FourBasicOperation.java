package org.example.stringcalculator.model;

import java.util.List;
import java.util.stream.IntStream;

public class FourBasicOperation {
    private static final String EXCEPTION_MESSAGE = "나누기에는 0이 입력되면 안됩니다.";
    private int calculationResult;

    public int repeatFourBasicOperation(List<Integer> numbers, List<String> operators, int operatorsSize) {
        int number = numbers.get(0);
        int number1 = numbers.get(1);
        String operator = operators.get(0);

        calculationResult = getToCalculationResult(number, number1, operator);

        IntStream.range(1, operatorsSize).forEach(
                i -> calculationResult = getToCalculationResult(calculationResult, numbers.get(i + 1),
                        operators.get(i)));

        return calculationResult;
    }

    private int getToCalculationResult(int number, int number1, String operator) {
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