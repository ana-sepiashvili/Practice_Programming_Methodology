import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram {

    public void run() {
        String text = readLine("Enter text: ");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int count = countSymbol(text, ch);
            println(ch + ": " + count);
        }
    }

    private int countSymbol(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
