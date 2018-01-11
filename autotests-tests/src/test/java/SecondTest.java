import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class SecondTest {

    @Test
    public void testCalculationDiv() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = 0;

        assertEquals(result, calculator.div(a,b));
    }

    @Test
    public void testCalculationDiv2() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = 0;

        assertThat(calculator.div(a,b), equalTo(result));
    }

    @Test
    public void testCalculationDiv3() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 16;

        int result = 0;

        Assertions.assertThat(calculator.div(a,b)).isEqualTo(result);
    }
}