import acm.program.ConsoleProgram;

public class Partitions extends ConsoleProgram {
    public void run() {
        System.out.println(partitions("ababa")); // todopr: clear
    }

    private int partitions(String str) {
        String first = "";
        String second = "";
        String third = "";

        int count = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            first = str.substring(0, i);
            if (!isPalindrome(first)) {
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                second = str.substring(i, j);
                if (!isPalindrome(second)) {
                    continue;
                }
                third = str.substring(j);
                if (isPalindrome(third)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}