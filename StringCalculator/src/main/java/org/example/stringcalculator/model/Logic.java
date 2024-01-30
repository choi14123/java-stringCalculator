package org.example.stringcalculator.model;

import java.util.List;
import java.util.stream.IntStream;

public class Logic {
    private int totalResultNumber;
    private FourBasicOperation fourBasicOperation = new FourBasicOperation();

    public void repeatFourBasicOperation(List<Integer> numbers, List<String> operators, int operatorsSize) {
        totalResultNumber = fourBasicOperation.getTotalResultNumberByNumber(numbers.get(0), numbers.get(1),
                operators.get(0));
        IntStream.range(1, operatorsSize)
                .forEach(i -> totalResultNumber = fourBasicOperation.getTotalResultNumberByNumber(totalResultNumber,
                        numbers.get(i + 1), operators.get(i)));
    }

    public int getTotalNumber() {
        return totalResultNumber;
    }
}