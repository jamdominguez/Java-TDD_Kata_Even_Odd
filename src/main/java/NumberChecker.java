public class NumberChecker {
    public static String evenOrOdd(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        String result = sum%2 == 0 ? "even" : "odd";
        return result;
    }
}
