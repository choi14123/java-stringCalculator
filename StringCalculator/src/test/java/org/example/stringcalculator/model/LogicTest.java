package org.example.stringcalculator.model;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LogicTest {
    @Test
    @DisplayName("사칙연산 후 최종 값이 나온다.")
    void loopTest() {
        //given
        List<Integer> numbers = Arrays.asList(10, 5, 3, 10, 2);
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        //when
        Logic logic = new Logic();
        logic.repeatFourBasicOperation(numbers, operators, operators.size());
        //then
        Assertions.assertThat(logic.getTotalNumber()).isEqualTo(60);
    }
}