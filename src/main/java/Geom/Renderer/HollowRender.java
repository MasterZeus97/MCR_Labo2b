package Geom.Renderer;

import Geom.Bouncable;

import java.awt.*;

public class HollowRender implements Renderer {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
}
