import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    int a = 10;
    int b = 17;
    int result = 27;

    Calculator calculator = new Calculator();

    @Test
    public void testCalculationSum() {
        assertEquals(result, calculator.sum(a, b));
    }

    @Test
    public void testCalculationSum2() {
        assertThat(calculator.sum(a, b)).isEqualTo(result);
    }
}
