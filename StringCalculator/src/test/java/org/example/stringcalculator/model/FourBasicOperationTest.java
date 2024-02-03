package org.example.stringcalculator.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FourBasicOperationTest {
    @Test
    @DisplayName("사칙연산 후 최종 값이 반환된다.")
    void repeatFourBasicOperationTest() {
        //given
        int calculationResult = 10;
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        List<Integer> numbers = List.of(2, 3, 4, 2);
        List<String> operators = List.of("+", "*", "/");
        //when
        int number = fourBasicOperation.repeatFourBasicOperation(numbers, operators, operators.size());
        //then
        Assertions.assertThat(number).isEqualTo(calculationResult);
    }

    @Test
    @DisplayName("나누기에는 숫자가 0이 입력되면 IllegalArgumentException 예외 발생.")
    void validateCheckNumberZeroTest() {
        //given
        List<Integer> numbers = List.of(2, 3, 4, 0);
        List<String> operators = List.of("+", "*", "/");
        //when
        //then
        assertThatThrownBy(() -> new FourBasicOperation().repeatFourBasicOperation(numbers, operators,
                operators.size())).isInstanceOf(IllegalArgumentException.class).hasMessage("나누기에는 0이 입력되면 안됩니다.");
    }
}