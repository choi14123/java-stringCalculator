package org.example.stringcalculator.model;

import java.util.List;

public class Logic {
    private int totalResultNumber;

    public void repeatFourBasicOperation(List<Integer> numbers, List<String> operators, int operatorsSize) {
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        totalResultNumber = fourBasicOperation.fourOperations(numbers.get(0), numbers.get(1), operators.get(0));
        for (int i = 1; i < operatorsSize; i++) {
            totalResultNumber = fourBasicOperation.fourOperations(totalResultNumber, numbers.get(i + 1),
                    operators.get(i));
        }
    }

    public int getTotalNumber() {
        return totalResultNumber;
    }
}