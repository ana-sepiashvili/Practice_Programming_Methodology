import acm.program.ConsoleProgram;

public class Problem15 extends ConsoleProgram {
    public void run() {
        println("This program calculates Arithmetic Mean");

        int x = readInt("Enter first number: ");
        int y = readInt("Enter second number: ");

        double average = (double) (x + y) / 2;
        println("Average of " + x + " and " + y + " is " + average);
    }
}
