package org.example.stringcalculator.model;

import java.util.HashMap;
import java.util.Map;
import org.example.stringcalculator.model.calculate.Calculate;
import org.example.stringcalculator.model.calculate.DivideCalculate;
import org.example.stringcalculator.model.calculate.MinusCalculate;
import org.example.stringcalculator.model.calculate.MultiplyCalculate;
import org.example.stringcalculator.model.calculate.PlusCalculate;

public class CalculatorMapping {
    private static Map<String, Calculate> calculatorMap = new HashMap<>();

    static {
        calculatorMap.put("+", new PlusCalculate());
        calculatorMap.put("-", new MinusCalculate());
        calculatorMap.put("*", new MultiplyCalculate());
        calculatorMap.put("/", new DivideCalculate());
    }

    public static Calculate getCalculator(String operator) {
        return calculatorMap.get(operator);
    }
}