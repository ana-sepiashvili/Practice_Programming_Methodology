import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram {

    public void run() {
        int n = readInt("enter number: ");
        int result = 0;
        int a = 0;
        int b = 1;

        if (n == 1) {
            println(a);
        } else if (n == 2) {
            println(b);
        } else {
            for (int i = 3; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            println(result);
        }
    }
}
