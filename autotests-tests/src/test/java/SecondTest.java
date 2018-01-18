import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class SecondTest {

    int a = 10;
    int b = 17;
    int result = 0;

    Calculator calculator = new Calculator();

    @Test
    public void testCalculationDiv() {
        assertEquals(result, calculator.div(a, b));
    }

    @Test
    public void testCalculationDiv2() {
        assertThat(calculator.div(a, b)).isEqualTo(result);
    }
}