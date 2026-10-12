import acm.program.ConsoleProgram;

public class ConsoleProgramSample extends ConsoleProgram {

    public void run() {
        // You fill this in
        println("This program calculates Arithmetic Mean");

        int x = readInt("Enter first number: ");
        int y = readInt("Enter second number: ");

        double average = (double) (x + y) / 2;
        println("Average of " + x + " and " + y + " is " + average);
    }

}
