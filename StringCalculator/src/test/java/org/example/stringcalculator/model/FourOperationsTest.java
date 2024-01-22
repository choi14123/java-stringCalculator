package org.example.stringcalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FourOperationsTest {

    @Test
    @DisplayName("더하기 테스트")
    void addTest() {
        //given
        //when
        FourOperations fourOperations = new FourOperations(1, 3, "+");
        //then
        Assertions.assertThat(fourOperations.getResult()).isEqualTo(4);
    }

    @Test
    @DisplayName("빼기 테스트")
    void subtractTest() {
        //given
        //when
        FourOperations fourOperations = new FourOperations(4, 1, "-");
        //then
        Assertions.assertThat(fourOperations.getResult()).isEqualTo(3);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void multiplyTest() {
        //given
        //when
        FourOperations fourOperations = new FourOperations(1, 3, "*");
        //then
        Assertions.assertThat(fourOperations.getResult()).isEqualTo(3);
    }

    @Test
    @DisplayName("나누기 테스트")
    void divideTest() {
        //given
        //when
        FourOperations fourOperations = new FourOperations(4, 2, "/");
        //then
        Assertions.assertThat(fourOperations.getResult()).isEqualTo(2);
    }
}