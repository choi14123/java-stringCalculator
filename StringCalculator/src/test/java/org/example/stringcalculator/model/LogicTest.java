package org.example.stringcalculator.model;


import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LogicTest {
    @Test
    @DisplayName("사칙연산 후 최종 값이 반환된다.")
    void repeatFourBasicOperationTest() {
        //given
        int totalResultNumber = 10;
        List<Integer> numbers = List.of(2, 3, 4, 2);
        List<String> operators = List.of("+", "*", "/");
        //when
        Logic logic = new Logic();
        logic.repeatFourBasicOperation(numbers, operators, operators.size());
        //then
        Assertions.assertThat(logic.getTotalNumber()).isEqualTo(totalResultNumber);
    }
}