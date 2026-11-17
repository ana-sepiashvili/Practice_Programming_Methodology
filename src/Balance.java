import acm.program.ConsoleProgram;

/**
 * Midterm 2024
 */
public class Balance extends ConsoleProgram {
    public void run() {
        String numbers = readLine("Enter number: ");
        int n = readInt("Enter n: ");
        println(isBalanced(numbers, n));
    }

    private boolean isBalanced(String numbers, int n) {
        int firstSum = countSum(numbers, 0, n);
        for (int i = 1; i < n; i++) {
            int currentSum = countSum(numbers, i, n);
            if (currentSum != firstSum) {
                return false;
            }
        }
        return true;
    }

    private int countSum(String numbers, int startIndex, int n) {
        int sum = 0;
        for (int i = startIndex; i < numbers.length(); i += n) {
            int digit = numbers.charAt(i) - '0';
            sum += digit;
        }
        return sum;
    }
}
