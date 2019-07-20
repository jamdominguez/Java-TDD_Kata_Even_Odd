public class NumberChecker {
    public static String evenOrOdd(int[] numbers) {
        for(int number : numbers){
            if (number == 1) return "odd";
        }
        return "even";
    }
}
