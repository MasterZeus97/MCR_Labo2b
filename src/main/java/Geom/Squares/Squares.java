package Geom.Squares;

import Display.Display;
import Geom.Forme;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Squares extends Forme {

    private final Color color;

    public Squares(Color color) {
        super();
        this.color = color;
    }

    @Override
    public void draw() {
        /*g2.setColor(g2.getBackground());
        g2.fillOval(posX, posY, size, size);*/

        renderer.display(Display.getInstance().getGraphics(), this);

        /*g2.setColor(getColor());
        g2.draw(getShape());*/
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
        Shape tmp = new Rectangle2D.Double(getPosX(), getPosY(), getSize(), getSize());
        return tmp;
    }
}
