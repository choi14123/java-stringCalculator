package org.example.controller;

import org.example.view.InputView;
import org.example.view.OutputView;

public class StringCalculatorController {
    public void start() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        int result = inputView.calculate(inputView.inputString());
        outputView.printResult(result);
    }
}