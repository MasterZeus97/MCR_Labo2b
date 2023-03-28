package Geom;

import Display.Display;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

public class Rond extends Forme {
    Color color;
    public Rond(int height, int width) {
        super(height, width);
        color = Color.BLUE;
    }

    @Override
    public void draw() {
        Graphics2D g2 = Display.getInstance().getGraphics();
        /*g2.setColor(g2.getBackground());
        g2.fillOval(posX, posY, size, size);*/

        g2.setColor(Color.BLUE);
        g2.draw(getShape());
        //move();
        //g2.fillOval(posX, posY, size,size);
        //g2.dispose();
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Shape getShape() {
        Shape tmp = new Arc2D.Double(50, 50, 300, 300, 90, 360, Arc2D.OPEN);
        return tmp;
    }
}
