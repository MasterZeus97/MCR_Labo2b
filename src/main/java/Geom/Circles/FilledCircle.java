package Geom.Circles;

import Display.Display;
import Geom.Forme;
import Geom.Renderer.FilledRender;
import Geom.Renderer.HollowRender;

import java.awt.*;
import java.awt.geom.Arc2D;

public class FilledCircle extends Circles {

    public FilledCircle() {
        super(Color.BLUE);
        renderer = new FilledRender();
    }

    @Override
    public void draw() {
        Graphics2D g2 = Display.getInstance().getGraphics();
        /*g2.setColor(g2.getBackground());
        g2.fillOval(posX, posY, size, size);*/

        g2.setColor(getColor());
        g2.fill(getShape());
        //move();
        //g2.fillOval(posX, posY, size,size);
        //g2.dispose();
    }
}