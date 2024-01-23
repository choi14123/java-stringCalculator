package org.example.stringcalculator.controller;

import org.example.stringcalculator.model.Numbers;
import org.example.stringcalculator.model.Operators;
import org.example.stringcalculator.model.Repeat;
import org.example.stringcalculator.view.InputView;
import org.example.stringcalculator.view.OutputView;

public class CalculatorController {
    private final OutputView outputView;
    private final Numbers numbers;
    private final Operators operators;

    public CalculatorController() {
        InputView inputView = new InputView();
        String[] values = inputView.array();
        this.numbers = new Numbers(values);
        this.operators = new Operators(values);
        this.outputView = new OutputView();
    }

    public void start() {
        Repeat repeat = new Repeat(numbers.getNumbers(), operators.getOperators(), operators.getOperatorsSize());
        outputView.printResult(repeat.getTotalNumber());
    }
}