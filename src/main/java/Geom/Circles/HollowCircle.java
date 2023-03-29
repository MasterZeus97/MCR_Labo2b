package Geom.Circles;

import Display.Display;
import Geom.Forme;
import Geom.Renderer.HollowRender;

import java.awt.*;
import java.awt.geom.Arc2D;

public class HollowCircle extends Circles {

    public HollowCircle() {
        super(Color.GREEN);
        renderer = new HollowRender();
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
}