package org.example.stringcalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    private static final String EXCEPTION_MESSAGE = " 잘못된 operator를 입력하였습니다.";
    private List<String> operators = new ArrayList<>();

    public Operators(String[] values) {
        operators = convertToOperatorsList(values);
    }

    private List<String> convertToOperatorsList(String[] values) {
        for (int i = 1; i < values.length; i += 2) {
            validateOperator(values[i]);
            operators.add(values[i]);
        }
        return operators;
    }

    private void validateOperator(String value) {
        if (!(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/"))) {
            throw new IllegalArgumentException(value + EXCEPTION_MESSAGE);
        }
    }

    public List<String> getOperators() {
        return operators;
    }
}