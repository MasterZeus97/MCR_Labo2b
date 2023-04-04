package Shapes.Factories;

import Shapes.Circles.Circles;
import Shapes.Squares.Squares;

/**
 * Interface ShapeFactories, à utiliser comme base pour créer les factories permettant d'instancier des Shapes
 *
 * @author Thibault Seem
 * @date 01.04.23
 */
public interface ShapeFactories {

    /**
     * Méthode à utiliser pour créer un carré
     * @return une nouvelle instance d'un carré
     */
    Squares createSquare();

    /**
     * Méthode à utiliser pour créer un cercle
     * @return une nouvelle instance d'un cercle
     */
    Circles createCircle();
}
