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

    @Test
    public void zeroPlusTwoMustBeEven() {
        int[] numbers = {0, 2};
        assertEquals("even", NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroPlusThreeMustBeOdd() {
        int[] numbers = {0, 3};
        assertEquals("odd", NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void zeroPlusFourMustBeEven(){
        int[] numbers = {0, 4};
        assertEquals("even", NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void evenPlusEvenMustEven() {
        int[] numbers = {0, 2, 4, 6, 8, 10};
        assertEquals("even", NumberChecker.evenOrOdd(numbers));
    }

    @Test
    public void plusTwoOddNumberMustBeEven() {
        int[] numbers = {1, 3};
        assertEquals("even", NumberChecker.evenOrOdd(numbers));
        int[] numbers2 = {3, 5};
        assertEquals("even", NumberChecker.evenOrOdd(numbers2));
        int[] numbers3 = {5, 7};
        assertEquals("even", NumberChecker.evenOrOdd(numbers3));
        int[] numbers4 = {7, 9};
        assertEquals("even", NumberChecker.evenOrOdd(numbers4));
        int[] numbers5 = {9, 11};
        assertEquals("even", NumberChecker.evenOrOdd(numbers5));
    }

    @Test
    public void plusTwoEvenNumberMustBeEven() {
        int[] numbers = {0, 2};
        assertEquals("even", NumberChecker.evenOrOdd(numbers));
        int[] numbers2 = {2, 4};
        assertEquals("even", NumberChecker.evenOrOdd(numbers2));
        int[] numbers3 = {4, 6};
        assertEquals("even", NumberChecker.evenOrOdd(numbers3));
        int[] numbers4 = {6, 8};
        assertEquals("even", NumberChecker.evenOrOdd(numbers4));
        int[] numbers5 = {8, 10};
        assertEquals("even", NumberChecker.evenOrOdd(numbers5));
    }

    @Test
    public void plusEvenAndOddMustBeOdd() {
        int[] numbers = {0, 1};
        assertEquals("odd", NumberChecker.evenOrOdd(numbers));
        int[] numbers2 = {1, 2};
        assertEquals("odd", NumberChecker.evenOrOdd(numbers2));
        int[] numbers3 = {2, 3};
        assertEquals("odd", NumberChecker.evenOrOdd(numbers3));
        int[] numbers4 = {3, 4};
        assertEquals("odd", NumberChecker.evenOrOdd(numbers4));
        int[] numbers5 = {4, 5};
        assertEquals("odd", NumberChecker.evenOrOdd(numbers5));
    }
}
