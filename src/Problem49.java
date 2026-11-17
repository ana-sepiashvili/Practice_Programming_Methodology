import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
    public void run() {
        String number = readLine("Enter number: ");
        println(stringToInteger(number));
    }

    private int stringToInteger(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0'; // char-ის რიცხვითი მნიშვნელობა
            res = res * 10 + digit; // 0 * 10 + 2
            // 2 * 10 + 3 = 23
            // 23 * 10 + 4 = 234
        }
        return res;
    }
}
