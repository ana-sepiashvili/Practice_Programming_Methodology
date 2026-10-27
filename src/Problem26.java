import acm.program.ConsoleProgram;

public class Problem26 extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter Number: ");
        int m = readInt("Enter Number: ");

        println(gcd(n, m));
    }

    private int gcd(int n, int m) {
        int smaller = 0;

        if (n > m) {
            smaller = m;
        } else {
            smaller = n;
        }

        for (int i = smaller; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
               return i;
            }
        }
        return 1;
    }
}
