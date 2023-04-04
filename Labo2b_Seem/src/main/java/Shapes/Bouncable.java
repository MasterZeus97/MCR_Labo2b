package Shapes;

import java.awt.*;

/**
 * Interface Bouncable, à utiliser comme base pour créer une forme pouvant rebondir
 *
 * @author MCR
 * @date 01.04.23
 */
public interface Bouncable {
    /**
     * Méthode à utiliser pour dessiner la forme
     */
    void draw();

    /**
     * Méthode à utiliser pour déplacer la forme
     */
    void move();

    /**
     * Méthode utilisée pour récupérer la couleur de la forme
     * @return Couleur de la forme
     */
    Color getColor();

    /**
     * Méthode utilisée pour générer un
     * @return La Shape représentant la forme à sa position
     */
    Shape getShape();
}
