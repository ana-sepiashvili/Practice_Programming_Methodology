import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.Color;

public class Problem34 extends GraphicsProgram {
    private final RandomGenerator rg = RandomGenerator.getInstance();
    private static final int MIN_RADIUS = 0;
    private static final int MAX_RADIUS = 100;
    private static final int NUM_CIRCLES = 1000;

    public void run() {
        for (int i = 0; i < NUM_CIRCLES; i++) {
            drawRandomCircle();
        }
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
