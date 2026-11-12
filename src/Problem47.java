import acm.program.ConsoleProgram;

public class Problem47 extends ConsoleProgram {
    public void run() {
        String text = readLine("Enter a text: ");
        boolean palindrome = isPalindrome(text);

        if (palindrome) {
            println(text + " is a palindrome.");
        } else {
            println(text + " is not a palindrome.");
        }
    }

    private boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
