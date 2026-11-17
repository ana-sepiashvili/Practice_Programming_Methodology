import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram {
    public void run() {
        String text = readLine("Enter text: ");
        println(removeDuplicates(text));
    }

    private String removeDuplicates(String text) {
        String res = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (text.indexOf(ch) == i) {
                res += ch;
            }
        }
        return res;
    }
}
