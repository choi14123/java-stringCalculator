package org.example.stringcalculator.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FourBasicOperationTest {

    @Test
    @DisplayName("1과 3을 더하면 4가 된다. 더하기 테스트")
    void addTest() {
        //given
        //when
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        //then
        Assertions.assertThat(fourBasicOperation.fourOperations(1, 3, "+")).isEqualTo(4);
    }

    @Test
    @DisplayName("4와 1을 빼면 3이 된다. 빼기 테스트")
    void subtractTest() {
        //given
        //when
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        //then
        Assertions.assertThat(fourBasicOperation.fourOperations(4, 1, "-")).isEqualTo(3);
    }

    @Test
    @DisplayName("1과 3을 곱하면 3이 된다. 곱하기 테스트")
    void multiplyTest() {
        //given
        //when
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        //then
        Assertions.assertThat(fourBasicOperation.fourOperations(1, 3, "*")).isEqualTo(3);
    }

    @Test
    @DisplayName("4와 2를 나누면 2가 된다. 나누기 테스트")
    void divideTest() {
        //given
        //when
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        //then
        Assertions.assertThat(fourBasicOperation.fourOperations(4, 2, "/")).isEqualTo(2);
    }

    @Test
    @DisplayName("나누기에는 숫자가 0이 입력되면 안됩니다. IllegalArgumentException 예외 발생.")
    void validateCheckNumberZeroTest() {
        //given
        //when
        //then
        assertThatThrownBy(() -> new FourBasicOperation().fourOperations(4, 0, "/")).isInstanceOf(
                        IllegalArgumentException.class)
                .hasMessage("나누기에는 0이 입력되면 안됩니다.");
    }
}