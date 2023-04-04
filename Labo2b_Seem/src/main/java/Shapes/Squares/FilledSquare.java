package Shapes.Squares;

import Display.Display;
import Shapes.Renderer.FilledRenderer;

import java.awt.*;

/**
 * Classe FilledSquare, héritant de la classe abstraite Squares, définissant la couleur du carré et implémentant
 * la méthode draw pour dessiner la shape sur un graphics2D.
 *
 * @author MCR
 * @date 01.04.23
 */
public class FilledSquare extends Squares {

    /**
     * Constructeur de FilledSquare indiquant la couleur de la forme
     */
    public FilledSquare() {
        super(Color.YELLOW);
    }

    /**
     * Méthode utilisée pour dessiner sur le graphique de l'image affichée par le singleton Display
     */
    @Override
    public void draw() {
        FilledRenderer.getInstance().display(Display.getInstance().getGraphics(), this);
    }
}
