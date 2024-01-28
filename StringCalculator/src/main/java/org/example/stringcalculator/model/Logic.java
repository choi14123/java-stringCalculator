package org.example.stringcalculator.model;

import java.util.List;
import java.util.stream.IntStream;

public class Logic {
    private int totalResultNumber;

    public void repeatFourBasicOperation(List<Integer> numbers, List<String> operators, int operatorsSize) {
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        totalResultNumber = fourBasicOperation.fourOperations(numbers.get(0), numbers.get(1), operators.get(0));
        IntStream.range(1, operatorsSize).forEach(
                i -> totalResultNumber = fourBasicOperation.fourOperations(totalResultNumber, numbers.get(i + 1),
                        operators.get(i)));
    }

    public int getTotalNumber() {
        return totalResultNumber;
    }
}