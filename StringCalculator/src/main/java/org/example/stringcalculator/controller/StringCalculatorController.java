package org.example.stringcalculator.controller;

import java.util.List;
import java.util.stream.IntStream;
import org.example.stringcalculator.model.CalculatorMapping;
import org.example.stringcalculator.model.Numbers;
import org.example.stringcalculator.model.Operators;
import org.example.stringcalculator.view.InputView;
import org.example.stringcalculator.view.OutputView;

public class StringCalculatorController {
    private final InputView inputView;
    private final OutputView outputView;

    public StringCalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        String[] values = inputView.array();

        Numbers numbers = new Numbers(values);
        Operators operators = new Operators(values);

        int calculationResult = repeatFourBasicOperation(numbers.getNumbers(), operators.getOperators(),
                operators.getOperators().size());
        outputView.totalResultNumber(calculationResult);
    }

    private int repeatFourBasicOperation(List<Integer> numbers, List<String> operators, int operatorsSize) {
        int number = numbers.get(0);
        int number1 = numbers.get(1);
        String operator = operators.get(0);

        int calculationResult = CalculatorMapping.getCalculator(operator).calculate(number, number1);

        return IntStream.range(1, operatorsSize).map(i -> CalculatorMapping.getCalculator(operators.get(i))
                .calculate(calculationResult, numbers.get(i + 1))).findFirst().orElse(calculationResult);
    }
}