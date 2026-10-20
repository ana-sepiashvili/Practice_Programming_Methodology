import acm.program.ConsoleProgram;

public class Problem19 extends ConsoleProgram {
    public void run() {
        println("Welcome to problem 19!");
        int n = readInt("Please enter a positive integer: ");
        while (n < 1) {
            println("Not a positive integer buddy. Try again!");
            n = readInt("Please enter a positive integer: ");
        }
        for (int i = 0; i < n; i += 2) {
            println("hello " + i);
        }
    }
}
