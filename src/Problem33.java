import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.Color;

public class Problem33 extends GraphicsProgram {
    private final RandomGenerator rg = RandomGenerator.getInstance();
    private static final int MIN_RADIUS = 10;
    private static final int MAX_RADIUS = 200;
    
    public void run() {
        drawRandomCircle();
    }

    private void drawRandomCircle() {
        int r = rg.nextInt(MIN_RADIUS, MAX_RADIUS);
        Color color = rg.nextColor();

        GOval circle = new GOval(2 * r, 2 * r);
        circle.setColor(color);
        circle.setFilled(true);

        int x = rg.nextInt(0, getWidth() - 2 * r);
        int y = rg.nextInt(0, getHeight() - 2 * r);
        add(circle, x, y);
    }
}
