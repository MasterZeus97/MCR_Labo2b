package Geom.Circles;

import Geom.Renderer.FilledRender;

import java.awt.*;

public class FilledCircle extends Circles {
    public FilledCircle() {
        super(Color.BLUE);
        renderer = new FilledRender();
    }
}