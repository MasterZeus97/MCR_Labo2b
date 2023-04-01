package Geom.Circles;

import Display.Display;
import Geom.Forme;

import java.awt.*;
import java.awt.geom.Arc2D;

public abstract class Circles extends Forme {
    private final Color color;

    public Circles(Color color) {
        super();
        this.color = color;
    }

    @Override
    public void draw() {
        renderer.display(Display.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Shape getShape() {
        int tmp2 = getPosY();
        Shape tmp = new Arc2D.Double(getPosX(), getPosY(), getSize(), getSize(), 0, 360, Arc2D.OPEN);
        return tmp;
    }
}