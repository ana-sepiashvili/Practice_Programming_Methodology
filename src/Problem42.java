import acm.graphics.GLine;
import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

public class Problem42 extends GraphicsProgram {
    private GLine line;

    public void run() {
        addMouseListeners();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (line == null) { // start of a line
            line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
            add(line);
        }
        else { // end of a line
            line = null;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (line != null) {
            line.setEndPoint(e.getX(), e.getY());
        }
    }
}
