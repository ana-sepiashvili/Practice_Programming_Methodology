import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class Problem43_v2 extends GraphicsProgram {
    private static final int RADIUS = 30;
    private GOval circle;

    public void run() {
        drawCircle();
        addMouseListeners();
    }
    // && and
    // || or

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getX() >= circle.getX() && e.getX() <= circle.getX() + 2 * RADIUS &&
            e.getY() >= circle.getY() && e.getY() <= circle.getY() + 2 * RADIUS)
        {
            circle.setLocation(e.getX() - RADIUS, e.getY() - RADIUS);
        }
    }

    private void drawCircle() {
        circle = new GOval(RADIUS * 2, RADIUS * 2);
        circle.setFilled(true);
        circle.setColor(Color.GREEN);
        add(circle, (double) getWidth() / 2 - RADIUS, (double) getHeight() / 2 - RADIUS);
    }
}
