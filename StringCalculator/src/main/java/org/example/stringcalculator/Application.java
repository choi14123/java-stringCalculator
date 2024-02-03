package org.example.stringcalculator;

import org.example.stringcalculator.controller.StringCalculatorController;

public class Application {
    public static void main(String[] args) {
        StringCalculatorController stringCalculatorController = new StringCalculatorController();
        stringCalculatorController.start();
    }
}


