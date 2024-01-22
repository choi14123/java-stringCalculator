package org.example.stringcalculator.model;

import java.util.List;

public class Repeat {
    private int totalResultNumber;

    public Repeat(List<Integer> numbers, List<String> operators, int operatorsSize) {
        loop(numbers, operators, operatorsSize);
    }

    private int loop(List<Integer> numbers, List<String> operators, int operatorsSize) {
        FourOperations fourOperations = new FourOperations(numbers.get(0), numbers.get(1), operators.get(0));
        totalResultNumber = fourOperations.getResult();

        for (int i = 1; i < operatorsSize; i++) {
            FourOperations result = new FourOperations(totalResultNumber, numbers.get(i + 1), operators.get(i));
            totalResultNumber = result.getResult();
        }
        return totalResultNumber;
    }

    public int getTotalNumber() {
        return totalResultNumber;
    }
}