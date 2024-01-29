package org.example.stringcalculator.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FourBasicOperationTest {
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