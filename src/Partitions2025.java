import acm.program.ConsoleProgram;

public class Partitions2025 extends ConsoleProgram {
    public void run() {
        println(partitions("aabbaa"));
    }

    private int partitions(String str) {
        String first = "";
        String second = "";
        String third = "";

        int count = 0;
        for (int endOfFirst = 1; endOfFirst < str.length() - 1; endOfFirst++) {
            first = str.substring(0, endOfFirst);
            if (isPalindrome(first)) {
                for (int endOfSecond = endOfFirst + 1; endOfSecond < str.length(); endOfSecond++) {
                    second = str.substring(endOfFirst, endOfSecond);
                    if (isPalindrome(second)) {
                        third = str.substring(endOfSecond);
                        if (isPalindrome(third)) {
                            count++;
                        }
                    }
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
