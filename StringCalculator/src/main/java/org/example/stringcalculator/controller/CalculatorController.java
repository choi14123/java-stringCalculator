package org.example.stringcalculator.controller;

import org.example.stringcalculator.model.Logic;
import org.example.stringcalculator.model.Numbers;
import org.example.stringcalculator.model.Operators;
import org.example.stringcalculator.view.InputView;
import org.example.stringcalculator.view.OutputView;

public class CalculatorController {

    private final InputView inputView;
    private final Logic logic;
    private final OutputView outputView;

    public CalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.logic = new Logic();
    }

    public void start() {
        String[] values = inputView.array();
        Numbers numbers = new Numbers(values);
        Operators operators = new Operators(values);
        logic.repeatFourBasicOperation(numbers.getNumbers(), operators.getOperators(), operators.getOperators().size());
        outputView.printResult(logic.getTotalNumber());
    }
}