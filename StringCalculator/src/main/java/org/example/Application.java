package org.example;

import org.example.controller.StringCalculatorController;

public class Application {
    public static void main(String[] args) {
        StringCalculatorController controller = new StringCalculatorController();
        controller.start();
    }
}