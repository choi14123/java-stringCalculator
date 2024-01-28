package org.example.stringcalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    @DisplayName("numbers에 숫자가 저장 및 반환 되는지 확인한다.")
    void setNumbersTest() {
        //given
        String[] values = new String[]{"1", "+", "2", "/", "3"};
        //when
        Numbers numbers = new Numbers(values);
        //then
        Assertions.assertThat(numbers.getNumbers().get(0)).isEqualTo(1);
        Assertions.assertThat(numbers.getNumbers().get(1)).isEqualTo(2);
        Assertions.assertThat(numbers.getNumbers().get(2)).isEqualTo(3);
    }
}