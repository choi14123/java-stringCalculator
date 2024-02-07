package org.example.stringcalculator.model.calculate;

public class MinusCalculate implements Calculate {
    @Override
    public int calculate(int number, int number1) {
        return number - number1;
    }
}