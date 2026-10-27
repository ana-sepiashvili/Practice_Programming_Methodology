import acm.program.ConsoleProgram;

public class Problem25 extends ConsoleProgram {
    public void run() {
        int n = readInt("Enter number: ");
        int m = readInt("Enter number: ");
        println(lcm(n, m));
    }

    private int lcm(int n, int m) {
        int biggerNumber = 0;
        if (n > m) {
            biggerNumber = n;
        } else {
            biggerNumber = m;
        }
        int result = biggerNumber;
        int usjIncreaser = 1;
        while (result % n != 0 || result % m != 0) {
            result = biggerNumber * usjIncreaser;
            usjIncreaser++;
        }

        //        while (true) { // igivea rac zemota while
        //            if (result % n == 0 && result % m == 0) {
        //                break;
        //            }
        //            result = biggerNumber * usjIncreaser;
        //            usjIncreaser++;
        //        }
        return result;
    }
}

