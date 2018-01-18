package io.avgribanov.utils;

import io.avgribanov.utils.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class SupTest {

    int a = 10;
    int b = 17;
    int result = -7;

    Calculator calculator = new Calculator();

    @Test
    public void testCalculationSup() {
        assertEquals(result, calculator.sup(a, b));
    }

    @Test
    public void testCalculationSup2() {
        assertThat(calculator.sup(a, b)).isEqualTo(result);
    }
}