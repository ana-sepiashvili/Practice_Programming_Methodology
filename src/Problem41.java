import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

public class Problem41 extends GraphicsProgram {
    private final RandomGenerator rg = RandomGenerator.getInstance();
    private static final int RADIUS = 10;

    public void run() {
        addMouseListeners();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();

        GOval circle = new GOval(RADIUS * 2, RADIUS * 2);
        circle.setFilled(true);
        circle.setColor(rg.nextColor());
        add(circle, x - RADIUS, y - RADIUS);
    }
}
