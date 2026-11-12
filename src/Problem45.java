import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {
    public void run() {
        String text = readLine("Enter a text: ");
        String symbol = readLine("Enter a symbol: ");

        while (symbol.length() != 1) {
            symbol = readLine("Enter a symbol: ");
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol.charAt(0)) {
                count++;
            }
        }
        println("Count of symbol " + symbol + " is " + count + ".");
    }
}
