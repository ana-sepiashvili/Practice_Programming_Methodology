import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {
    public void run() {
        for (int i = 2; i < 1000000; i++) {
            if (isPrime(i)) {
                println(i + " is prime number.");
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
