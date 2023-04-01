package Shapes.Circles;

import Display.Display;
import Shapes.Renderer.HollowRenderer;

import java.awt.*;

/**
 * Classe HollowCircle, héritant de la classe abstraite Circles, définissant la couleur du cercle et implémentant
 * la méthode draw pour dessiner la shape sur un graphics2D.
 *
 * @author MCR
 * @date 01.04.23
 */
public class HollowCircle extends Circles {

    /**
     * Constructeur de HollowCircle indiquant la couleur de la forme
     */
    public HollowCircle() {
        super(Color.GREEN);
    }

    /**
     * Méthode utilisée pour dessiner sur le graphique de l'image affichée par le singleton Display
     */
    @Override
    public void draw() {
        HollowRenderer.getInstance().display(Display.getInstance().getGraphics(), this);
    }
}