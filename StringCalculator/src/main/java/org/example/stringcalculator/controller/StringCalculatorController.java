package org.example.stringcalculator.controller;

import org.example.stringcalculator.model.FourBasicOperation;
import org.example.stringcalculator.model.Numbers;
import org.example.stringcalculator.model.Operators;
import org.example.stringcalculator.view.InputView;
import org.example.stringcalculator.view.OutputView;

public class StringCalculatorController {
    private final InputView inputView;
    private final OutputView outputView;
    private final FourBasicOperation fourBasicOperation;

    public StringCalculatorController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.fourBasicOperation = new FourBasicOperation();
    }

    public void start() {
        String[] values = inputView.array();

        Numbers numbers = new Numbers(values);
        Operators operators = new Operators(values);

        int calculationResult = fourBasicOperation.repeatFourBasicOperation(numbers.getNumbers(),
                operators.getOperators(), operators.getOperators().size());

        outputView.totalResultNumber(calculationResult);
    }
}
