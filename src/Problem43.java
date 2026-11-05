import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

public class Problem43 extends GraphicsProgram {
    private GOval circle;
    private static final int RADIUS = 50;

    public void run() {
        drawCircle();
        addMouseListeners();
    }

    private void drawCircle() {
        circle = new GOval(RADIUS * 2, RADIUS * 2);
        add(circle, (double) getWidth() / 2 - RADIUS,
            (double) getHeight() / 2 - RADIUS);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();

        if (x >= circle.getX() && y >= circle.getY() && x <= circle.getX() + RADIUS * 2
            && y <= circle.getY() + RADIUS * 2)
        {
            circle.setLocation(x - RADIUS, y - RADIUS);
        }
    }
}
