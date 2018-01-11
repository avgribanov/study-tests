import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class SupTest {

    @Test
    public void testCalculationSup() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = -7;

        assertEquals(result, calculator.sup(a,b));
    }

    @Test
    public void testCalculationSup2() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = -7;

        assertThat(calculator.sup(a,b), equalTo(result));
    }

    @Test
    public void testCalculationSup3() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = -7;

        Assertions.assertThat(calculator.sup(a,b)).isEqualTo(result);
    }
}