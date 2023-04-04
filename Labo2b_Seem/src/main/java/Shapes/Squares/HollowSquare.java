package Shapes.Squares;

import Display.Display;
import Shapes.Renderer.HollowRenderer;

import java.awt.*;

/**
 * Classe HollowSquares, héritant de la classe abstraite Squares, définissant la couleur du carré et implémentant
 * la méthode draw pour dessiner la shape sur un graphics2D.
 *
 * @author MCR
 * @date 01.04.23
 */
public class HollowSquare extends Squares {

    /**
     * Constructeur de HollowSquare indiquant la couleur de la forme
     */
    public HollowSquare() {
        super(Color.RED);
    }

    /**
     * Méthode utilisée pour dessiner sur le graphique de l'image affichée par le singleton Display
     */
    @Override
    public void draw() {
        HollowRenderer.getInstance().display(Display.getInstance().getGraphics(), this);
    }
}
