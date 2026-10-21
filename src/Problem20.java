import acm.program.ConsoleProgram;

public class Problem20 extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter positive integer: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = readInt("Enter any number: ");
            sum += x;
        }
        println("Total is: " + sum);
    }
}
