package org.example.view;

import java.util.Scanner;
import org.example.model.CalculatorMapping;

public class InputView {
    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public int calculate(String inputText) {
        String tokens[] = inputText.trim().split(" ");
        int result = toInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = toInt(tokens[i + 1]);
            result = calculate(operator, result, number);
        }
        return result;
    }

    private static int toInt(String value) {
        return Integer.parseInt(value);
    }

    private static int calculate(String operator, int result, int number) {
        return CalculatorMapping.getCalculator(operator).calculate(result, number);
    }
}