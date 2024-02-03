package org.example.stringcalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private List<Integer> numbers = new ArrayList<>();

    public Numbers(String[] values) {
        numbers = addToNumbersList(values);
    }

    private List<Integer> addToNumbersList(String[] values) {
        for (int i = 0; i < values.length; i += 2) {
            numbers.add(Integer.valueOf(values[i]));
        }
        return numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}