import acm.program.ConsoleProgram;

public class Problem46 extends ConsoleProgram {
    public void run() {
        String text = readLine("Enter Text: ");
        char ch = getMostFrequentSymbol(text);
        println("Most Frequent Symbol was: " + ch);
    }

    private char getMostFrequentSymbol(String text) {
        int max = 0;
        char result = 'a';

        for (int i = 0; i < text.length(); i++) {
            int count = countSymbols(text, text.charAt(i));
            if (count > max) {
                max = count;
                result = text.charAt(i);
            }
        }
        return result;
    }

    private int countSymbols(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;

    }

}
