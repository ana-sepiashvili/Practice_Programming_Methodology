import acm.program.ConsoleProgram;

public class Problem23 extends ConsoleProgram {

    public void run() {
        int input = readInt("enter number: ");
        int sum = 0;

        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        println("sum of numbers up to " + input + " is: " + sum);
    }
}
