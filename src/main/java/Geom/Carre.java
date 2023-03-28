package Geom;

import Display.Display;
import Geom.Forme;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Carre extends Forme {

    private Color color;
    private boolean test = false;
    public Carre(int height, int width) {
        super(height, width);
        color = Color.YELLOW;
    }

    @Override
    public void draw() {
        Graphics2D g2 = Display.getInstance().getGraphics();
        /*g2.setColor(g2.getBackground());
        g2.fillRect(posX, posY, size, size);*/

        /*posY += speedY;
        posX += speedX;*/

        g2.setColor(color);
        g2.draw(getShape());
        /*g2.setColor(getColor());
        g2.fillRect(posX, posY, size, size);*/
        //Display.getInstance().repaint();
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Shape getShape() {
        Shape tmp = new Rectangle2D.Double(getPosX(), getPosY(), getSize(), getSize());
        return tmp;
    }
}
