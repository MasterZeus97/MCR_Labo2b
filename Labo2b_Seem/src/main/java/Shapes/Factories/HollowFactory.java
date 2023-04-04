package Shapes.Factories;

import Shapes.Circles.Circles;
import Shapes.Circles.HollowCircle;
import Shapes.Squares.HollowSquare;
import Shapes.Squares.Squares;

/**
 * Class FilledFactory, héritant de la classe ShapeFactory, et implémentant les méthode pour créer un cercle et un carré
 * vide
 *
 * @author Thibault Seem
 * @date 01.04.23
 */
public class HollowFactory implements ShapeFactories {

    /**
     * Méthode pour créer un carré vidé
     * @return Un nouvel objet de type Squares représentant un carré vidé
     */
    @Override
    public Squares createSquare() {
        return new HollowSquare();
    }

    /**
     * Méthode pour créer un cercle vidé
     * @return Un nouvel objet de type Squares représentant un cercle vidé
     */
    @Override
    public Circles createCircle() {
        return new HollowCircle();
    }
}
