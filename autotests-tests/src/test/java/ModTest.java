import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class ModTest {

    @Test
    public void testCalculationMod() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = 170;

        assertEquals(result, calculator.mod(a,b));
    }

    @Test
    public void testCalculationMod2() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = 170;

        assertThat(calculator.mod(a,b), equalTo(result));
    }

    @Test
    public void testCalculationMod3() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = 170;

        Assertions.assertThat(calculator.mod(a,b)).isEqualTo(result);
    }
}
