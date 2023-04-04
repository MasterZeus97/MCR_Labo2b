package Shapes.Circles;

import Display.Display;
import Shapes.Renderer.FilledRenderer;

import java.awt.*;

/**
 * Classe FilledCircle, héritant de la classe abstraite Circles, définissant la couleur du cercle et implémentant
 * la méthode draw pour dessiner la shape sur un graphics2D.
 *
 * @author MCR
 * @date 01.04.23
 */
public class FilledCircle extends Circles {

    /**
     * Constructeur de FilledCircle indiquant la couleur de la forme
     */
    public FilledCircle() {
        super(Color.BLUE);
    }

    /**
     * Méthode utilisée pour dessiner sur le graphique de l'image affichée par le singleton Display
     */
    @Override
    public void draw() {
        FilledRenderer.getInstance().display(Display.getInstance().getGraphics(), this);
    }
}