package org.example.stringcalculator.view;

import java.util.Scanner;

public class InputView {
    public String[] array() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value.split(" ");
    }
}
