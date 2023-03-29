package Geom.Squares;

import Display.Display;
import Geom.Renderer.HollowRender;

import java.awt.*;

public class HollowSquare extends Squares {
    public HollowSquare() {
        super(Color.RED);
        renderer = new HollowRender();
    }
}
