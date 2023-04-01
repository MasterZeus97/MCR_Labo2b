package Shapes.Factories;

import Shapes.Circles.Circles;
import Shapes.Circles.FilledCircle;
import Shapes.Squares.FilledSquare;
import Shapes.Squares.Squares;

/**
 * Class FilledFactory, héritant de la classe ShapeFactory, et implémentant les méthode pour créer un cercle et un carré
 * remplis
 *
 * @author Thibault Seem
 * @date 01.04.23
 */
public class FilledFactory implements ShapeFactories {

    /**
     * Méthode pour créer un carré plein
     * @return Un nouvel objet de type Squares représentant un carré remplis
     */
    @Override
    public Squares createSquare() {
        return new FilledSquare();
    }

    /**
     * Méthode pour créer un cercle plein
     * @return Un nouvel objet de type Squares représentant un cercle remplis
     */
    @Override
    public Circles createCircle() {
        return new FilledCircle();
    }
}
