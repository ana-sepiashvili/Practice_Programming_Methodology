import acm.graphics.GOval;
import acm.program.ConsoleProgram;

public class Seminar15 extends ConsoleProgram {
    public void run() {
        String str = "Hello"; // Immutable - უცვლელი
        str = "Goodbye";
        changeString(str);
        println(str);

        //primitive type
        int x = 10;
        changeInteger(x);
        println(x);

        // Objects 
        GOval circle = new GOval(100, 100);
        circle.setFilled(true);
        changeGOval(circle);
        println(circle.isFilled());
    }

    private void changeGOval(GOval circle) {
        circle.setFilled(false);
    }

    private void changeInteger(int x) {
        x = 27;
    }

    private void changeString(String str) {
        str = "123";
    }
}
