package Shapes.Squares;

import Shapes.AbstractShapes;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Class abstraite Squares, héritant de la classe AbstractShapes, et implémentant la méthode getShape pour obtenir
 *  * une forme de carré
 *  *
 * @author Thibault Seem
 * @date 01.04.23
 */
public abstract class Squares extends AbstractShapes {


    /**
     * Constructeur de forme initialisant les attributs de taille, de position et de déplacement aléatoirement
     *
     * @param color : Couleur de la forme
     */
    public Squares(Color color) {
        super(color);
    }

    /**
     * Méthode pour récupérer la Shape d'un carré
     * @return Shape du carré
     */
    @Override
    public Shape getShape() {
        return new Rectangle2D.Double(posX, posY, size, size);
    }
}
