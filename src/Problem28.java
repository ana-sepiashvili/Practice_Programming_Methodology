import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
    public void run() {
        int n = readInt("enter the number: ");
        int count = 0;

        while (n != -1) {
            if (n % 2 == 0) {
                count++;
            }
            n = readInt("enter the number: ");
        }
        println(count);
    }
}
