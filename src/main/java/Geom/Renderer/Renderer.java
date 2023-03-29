package Geom.Renderer;

import Geom.Bouncable;

import java.awt.*;

public interface Renderer {
    void display(Graphics2D g, Bouncable b);
}
