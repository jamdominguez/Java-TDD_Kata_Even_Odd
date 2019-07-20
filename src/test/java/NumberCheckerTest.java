import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTest {

    @Test
    public void emptyInputArrayIsEqualToZero() {
        int[] numbers = {};
        assertEquals("even", NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroInputArrayIsEqualToZero() {
        int[] numbers = {0};
        assertEquals("even", NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroPlusOneMustBeOdd() {
        int[] numbers = {0, 1};
        assertEquals("odd", NumberChecker.evenOrOdd(numbers));
    }
}
