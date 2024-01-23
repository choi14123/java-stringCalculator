package org.example.stringcalculator.model;

import java.util.List;

public class Repeat {
    private int totalResultNumber;

    public Repeat(List<Integer> numbers, List<String> operators, int operatorsSize) {
        repeatFourOperations(numbers, operators, operatorsSize);
    }

    private void repeatFourOperations(List<Integer> numbers, List<String> operators, int operatorsSize) {
        FourOperations fourOperations = new FourOperations(numbers.get(0), numbers.get(1), operators.get(0));
        totalResultNumber = fourOperations.getResult();

        for (int i = 1; i < operatorsSize; i++) {
            FourOperations result = new FourOperations(totalResultNumber, numbers.get(i + 1), operators.get(i));
            totalResultNumber = result.getResult();
        }
    }

    public int getTotalNumber() {
        return totalResultNumber;
    }
}