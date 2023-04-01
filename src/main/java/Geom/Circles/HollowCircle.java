package Geom.Circles;

import Geom.Renderer.HollowRender;

import java.awt.*;

public class HollowCircle extends Circles {
    public HollowCircle() {
        super(Color.GREEN);
        renderer = new HollowRender();
    }
}