package Display;

import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * Interface Displayer, à utiliser comme base pour créer une classe
 *
 * @author MCR
 * @date 01.04.23
 */
public interface Displayer {

    /**
     * Méthode pour obtenir la largeur de l'affichage
     * @return La largeur de l'affichage
     */
    int getWidth();

    /**
     * Méthode pour obtenir la hauteur de l'affichage
     * @return La hauteur de l'affichage
     */
    int getHeight();

    /**
     * Méthode pour obtenir le Graphics2D de l'image affichée
     * @return Le Graphics2D de l'image affichée
     */
    Graphics2D getGraphics();

    /**
     * Méthode pour actualiser l'affichage avec le graphics de la méthode getGraphics
     */
    void repaint();

    /**
     * Méthode pour modifier le nom de la fenêtre créée
     * @param title : String du titre de la fenêtre
     */
    void setTitle(String title);

    /**
     * Méthode pour ajouter un keyAdapter au keyListener du JFrame
     * @param ka : KeyAdapter à ajouter au keyListener du JFrame
     */
    void addKeyListener(KeyAdapter ka);
}
