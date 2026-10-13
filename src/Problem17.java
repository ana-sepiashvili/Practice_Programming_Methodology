import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram {
    public void run() {
        println("This is problem 17.");
        double a = readDouble("Enter double value: ");
        int m = (int) a;
        double w = a - m;

        println("რიცხვის მთელი ნაწილი არის " + m);
        println("წილადი ნაწილი არის " + w);
    }
}
