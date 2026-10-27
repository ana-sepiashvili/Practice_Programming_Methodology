import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter an integer: ");
        int result = 0;

        while (n > 0) {
            int a = n % 10;
            n /= 10;
            result *= 10;
            result += a;
        }
        println(result);
    }
}
