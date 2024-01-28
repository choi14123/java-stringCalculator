package org.example.stringcalculator.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperatorsTest {
    @Test
    @DisplayName("operators에 문자 '+', '-', '*', '/'만 들어가는지 확인한다.")
    void setOperatorsTest() {
        //given
        String[] values = new String[]{"1", "+", "2", "/", "3"};
        //when
        Operators operators = new Operators(values);
        //then
        Assertions.assertThat(operators.getOperators().get(0)).isEqualTo("+");
        Assertions.assertThat(operators.getOperators().get(1)).isEqualTo("/");
    }

    @Test
    @DisplayName("operators에는 '+', '-', '*', '/' 만 들어가야 한다. 이외의 문자인 a가 입력되면 입력 되면 예외 발생.")
    void validateOperatorTest() {
        //given
        String[] values = new String[]{"1", "a", "2", "/", "3"};
        //when
        //then
        assertThatThrownBy(() -> new Operators(values)).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("a" + " 잘못된 operator를 입력하였습니다.");

    }
}