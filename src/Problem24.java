import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram {

    public void run() {
        int num = readInt("Enter number: ");
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        println(count);
    }
}
