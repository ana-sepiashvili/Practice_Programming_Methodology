import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter number: ");
        if (isPrime(n)) {
            println(n + " is prime number.");
        } else {
            println(n + " is not a prime number.");
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
