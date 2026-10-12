import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.Color;

public class GraphicsProgramSample extends GraphicsProgram {

    public void run() {
        drawHouse();
    }

    private void drawHouse() {
        drawWall();
        drawRoof();
        drawDoor();
        drawWindow();
    }

    private void drawWindow() {

    }

    private void drawDoor() {

    }

    private void drawRoof() {
        //        GLine roofLeftLine = new GLine(200, getHeight() - 300, 200 + 150, getHeight() - 300 - 100);
        //        roofLeftLine.setColor(Color.blue);
        //        add(roofLeftLine);
        //
        //        GLine roofRightLine = new GLine(200 + 150, getHeight() - 300 - 100, 200 + 300, getHeight() - 300);
        //        roofRightLine.setColor(Color.blue);
        //        add(roofRightLine);

        for (int y = getHeight() - 300, i = 0; 200 + i <= 200 + 300 - i; y--, i++) {
            GLine line = new GLine(200 + i, y, 200 + 300 - i, y);
            line.setColor(Color.red);
            add(line);
        }
    }

    private void drawWall() {
        GRect wall = new GRect(200, getHeight() - 300, 300, 300);
        wall.setFilled(true);
        wall.setFillColor(Color.pink);
        wall.setColor(Color.pink);
        add(wall);
    }

}
