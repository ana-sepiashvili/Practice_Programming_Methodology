import acm.program.ConsoleProgram;

public class Problem27 extends ConsoleProgram {
    public void run() {
        int n = readInt("enter the number n: ");
        int m = readInt("enter the number m: ");
        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n;
        }
        println("n^m = " + result);
    }
}
