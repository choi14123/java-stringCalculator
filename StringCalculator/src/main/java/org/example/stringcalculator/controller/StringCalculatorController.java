package org.example.stringcalculator.controller;

import java.util.List;
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

    public int repeatFourBasicOperation(List<Integer> numbers, List<String> operators, int operatorsSize) {

        int totalResultNumber = CalculatorMapping.getCalculator(operators.get(0))
                .calculate(numbers.get(0), numbers.get(1));
        int b = CalculatorMapping.getCalculator(operators.get(1)).calculate(totalResultNumber, numbers.get(2));
        int a = CalculatorMapping.getCalculator(operators.get(2)).calculate(b, numbers.get(3));
        return a;
    }
}