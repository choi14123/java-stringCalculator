package org.example.stringcalculator.model;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    @DisplayName("객체에 숫자가 저장 및 반환 되는지 확인한다.")
    void setNumbersTest() {
        //given
        String[] values = new String[]{"1", "+", "2", "/", "3"};
        List<Integer> numbersList = List.of(1, 2, 3);
        //when
        Numbers numbers = new Numbers(values);
        //then
        Assertions.assertThat(numbers.getNumbers()).isEqualTo(numbersList);
    }
}