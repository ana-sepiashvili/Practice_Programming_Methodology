import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram {

    public void run() {
        println("This is problem 18");

        int a = readInt("Enter first number: ");
        int b = readInt("Enter second number: ");

        if (a > b) {
            println("Max is " + a);
        } else if (a == b) {
            println("a and b are equal");
        } else {
            println("Max is " + b);
        }
    }
}
