import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTest{

    @Test
    public void emptyInputArrayIsEqualTo0(){
        int[] numbers = {};
        assertEquals("even", NumberChecker.evenOrOdd(numbers));
    }
}
