package org.example.stringcalculator.view;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public String[] array() {
        String value = scanner.nextLine();
        return value.split(" ");
    }
}