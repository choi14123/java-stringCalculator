package org.example.stringcalculator.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FourBasicOperationTest {
    @ParameterizedTest
    @MethodSource("fourOperationsTest")
    @DisplayName("두 수와 연산자를 넣으면 계산한 후 최종 값을 반환한다.")
    void fourOperationsTest(int number, int number1, String operator, int totalNumber) {
        //given
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        //when
        int result = fourBasicOperation.fourOperations(number, number1, operator);
        //then
        Assertions.assertThat(result).isEqualTo(totalNumber);
    }

    private static Stream<Arguments> fourOperationsTest() {
        return Stream.of(
                Arguments.of(4, 2, "+", 6),
                Arguments.of(4, 2, "-", 2),
                Arguments.of(4, 2, "*", 8),
                Arguments.of(4, 2, "/", 2)
        );
    }

    @Test
    @DisplayName("나누기에는 숫자가 0이 입력되면 IllegalArgumentException 예외 발생.")
    void validateCheckNumberZeroTest() {
        //given
        //when
        //then
        assertThatThrownBy(() -> new FourBasicOperation().fourOperations(4, 0, "/")).isInstanceOf(
                        IllegalArgumentException.class)
                .hasMessage("나누기에는 0이 입력되면 안됩니다.");
    }
}