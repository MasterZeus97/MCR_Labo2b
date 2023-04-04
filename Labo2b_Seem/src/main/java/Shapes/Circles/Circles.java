package Shapes.Circles;

import Shapes.AbstractShapes;

import java.awt.*;
import java.awt.geom.Arc2D;

/**
 * Class abstraite Circles, héritant de la classe AbstractShapes, et implémentant la méthode getShape pour obtenir
 * une forme de cercle
 *
 * @author Thibault Seem
 * @date 01.04.23
 */
public abstract class Circles extends AbstractShapes {

    /**
     * Constructeur de forme initialisant les attributs de taille, de position et de déplacement aléatoirement
     *
     * @param color : couleur de la forme
     */
    public Circles(Color color) {
        super(color);
    }

    /**
     * Méthode pour récupérer la Shape d'un cercle
     * @return Shape du cercle
     */
    @Override
    public Shape getShape() {
        return new Arc2D.Double(posX, posY, size, size, 0, 360, Arc2D.CHORD);
    }
}