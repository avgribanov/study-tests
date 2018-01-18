package io.avgribanov.utils;

import io.avgribanov.utils.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class ModTest {

    int a = 10;
    int b = 17;
    int result = 170;

    Calculator calculator = new Calculator();

    @Test
    public void testCalculationMod() {
        assertEquals(result, calculator.mod(a, b));
    }

    @Test
    public void testCalculationMod2() {
        assertThat(calculator.mod(a, b)).isEqualTo(result);
    }

}
