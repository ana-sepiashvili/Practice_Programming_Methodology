import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter an integer: ");
        int result = 0;

        while (n > 0) {
            int a = n % 10; // 6 5 2 1
            n /= 10; // 125 12 1 0
            result *= 10; // 0 60 650 6520
            result += a; // 6 65 652 6521
        }
        println(result);
    }
}
