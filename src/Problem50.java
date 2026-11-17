import acm.program.ConsoleProgram;

import java.util.StringTokenizer;

public class Problem50 extends ConsoleProgram {
    public void run() {
        String text = readLine("Enter text: ");
        StringTokenizer tokenizer = new StringTokenizer(text);
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            count++;
            String word = tokenizer.nextToken();
            println(word);
        }
        println("Number of words in text is " + count);
    }
}
