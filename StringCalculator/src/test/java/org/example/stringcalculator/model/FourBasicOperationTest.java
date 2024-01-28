package org.example.stringcalculator.model;

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
    @DisplayName("빼기 테스트")
    void subtractTest() {
        //given
        //when
        //when
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        //then
        Assertions.assertThat(fourBasicOperation.fourOperations(4, 1, "-")).isEqualTo(3);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void multiplyTest() {
        //given
        //when
        //when
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        //then
        Assertions.assertThat(fourBasicOperation.fourOperations(1, 3, "*")).isEqualTo(3);
    }

    @Test
    @DisplayName("나누기 테스트")
    void divideTest() {
        //given
        //when
        //when
        FourBasicOperation fourBasicOperation = new FourBasicOperation();
        //then
        Assertions.assertThat(fourBasicOperation.fourOperations(4, 2, "/")).isEqualTo(2);
    }
}