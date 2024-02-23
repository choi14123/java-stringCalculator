package org.example.stringcalculator.model;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorMappingTest {
    @Test
    @DisplayName("")
    void getCalculatorTest() {
        //given
        CalculatorMapping calculatorMapping = new CalculatorMapping();
        List<Integer> numbers = List.of(1, 2, 3);
        List<String> operators = List.of("+", "-");
        //when
        int calculationResult = calculatorMapping.getCalculator(operators.get(0))
                .calculate(numbers.get(0), numbers.get(1));
        //then
        Assertions.assertThat(calculationResult).isEqualTo(3);
    }

}