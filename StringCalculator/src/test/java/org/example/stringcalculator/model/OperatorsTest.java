package org.example.stringcalculator.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperatorsTest {
    @Test
    @DisplayName("객체에 '+', '-', '*', '/' 저장 및 반환 되는지 확인한다.")
    void setNumbersTest() {
        //given
        String[] values = new String[]{"1", "+", "2", "/", "3"};
        List<String> numbersList = List.of("+", "/");
        //when
        Operators operators = new Operators(values);
        //then
        Assertions.assertThat(operators.getOperators()).isEqualTo(numbersList);
    }

    @Test
    @DisplayName("객체에는 '+', '-', '*', '/' 만 들어가야 한다. 이외의 문자가 입력되면 예외 발생.")
    void validateOperatorTest() {
        //given
        String[] values = new String[]{"1", "a", "2", "/", "3"};
        //when
        //then
        assertThatThrownBy(() -> new Operators(values)).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 operator를 입력하였습니다.");
    }
}