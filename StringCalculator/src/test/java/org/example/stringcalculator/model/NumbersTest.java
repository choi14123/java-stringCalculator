package org.example.stringcalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    @DisplayName("numbers에 숫자만 들어가는지 확인한다.")
    void setNumbersTest() {
        //given
        String[] values = new String[]{"1", "+", "2", "/", "3"};
        //when
        Numbers numbers = new Numbers(values);
        //then
        Assertions.assertThat(numbers.getNumbers().size()).isEqualTo(3);
    }
}