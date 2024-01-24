package org.example.stringcalculator.model;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RepeatTest {
    @Test
    @DisplayName("사칙연산 값이 나온다.")
    void loopTest() {
        //given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(3);
        numbers.add(10);
        numbers.add(2);
        List<String> operators = new ArrayList<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        //when
        Repeat repeat = new Repeat(numbers, operators, operators.size());
        //then
        Assertions.assertThat(repeat.getTotalNumber()).isEqualTo(60);
    }
}