import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram {
    public void run() {
        println("This is problem 16. It calculates harmonious mean.");
        double a = readInt("Enter first number: ");
        while (a == 0) {
            println("Illegal value");
            a = readInt("Enter first number: ");
        }

        double b = readInt("Enter second number: ");
        while (b == 0) {
            println("Illegal value");
            b = readInt("Enter second number: ");
        }

        double c = readInt("Enter third number: ");
        while (c == 0) {
            println("Illegal value");
            c = readInt("Enter third number: ");
        }

        double result = 1 / (1 / a + 1 / b + 1 / c);
        println("Harmonious mean of " + a + ", " + b + " and " + c + " is: " + result);
    }
}
