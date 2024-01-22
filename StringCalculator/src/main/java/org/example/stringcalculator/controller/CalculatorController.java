package org.example.stringcalculator.controller;

import org.example.stringcalculator.model.Numbers;
import org.example.stringcalculator.model.Operators;
import org.example.stringcalculator.model.Repeat;
import org.example.stringcalculator.view.InputView;
import org.example.stringcalculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        String[] values = inputView.array();
        Numbers numbers = new Numbers(values);
        Operators operators = new Operators(values);
        Repeat repeat = new Repeat(numbers.getNumbers(), operators.getOperators(), operators.getOperatorsSize());
        outputView.printResult(repeat.getTotalNumber());
    }
}
