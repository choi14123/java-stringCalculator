package org.example.stringcalculator.model.calculate;

public class DivideCalculate implements Calculate {
    @Override
    public int calculate(int number, int number1) {
        validateCheckZero(number1);
        return number / number1;
    }

    private void validateCheckZero(int number1) {
        if (number1 == 0) {
            throw new IllegalArgumentException("0를 입력하면 안됩니다.");
        }
    }
}