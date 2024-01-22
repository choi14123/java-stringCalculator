package org.example.stringcalculator;

import org.example.stringcalculator.controller.CalculatorController;

public class Application {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        controller.start();
    }
}