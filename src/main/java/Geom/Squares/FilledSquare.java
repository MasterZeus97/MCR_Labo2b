package Geom.Squares;

import Geom.Renderer.FilledRender;

import java.awt.*;

public class FilledSquare extends Squares {
    public FilledSquare() {
        super(Color.YELLOW);
        renderer = new FilledRender();
    }
}
