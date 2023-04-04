package Shapes.Renderer;

import Shapes.Bouncable;

import java.awt.*;

/**
 * Interface Renderer, à utiliser comme base pour créer une une classe permettant de dessiner un Bouncable sur
 * un Graphics2D
 *
 * @author MCR
 * @date 01.04.23
 */
public interface Renderer {

    /**
     * Méthode à utiliser pour dessiner un Bouncable sur un Graphics2D
     * @param g : Graphics2D sur lequel dessiner
     * @param b : Bouncable à dessiner
     */
    void display(Graphics2D g, Bouncable b);
}
