package Shapes.Renderer;

import Shapes.Bouncable;

import java.awt.*;

/**
 * Classe FilledRenderer, cette classe implémente l'interface Renderer. Cette classe met un place un singleton et
 * implémente la méthode display pour une forme remplie
 */
public class FilledRenderer implements Renderer {
    private static FilledRenderer instance;

    /**
     * Constructeur privé pour le renderer de forme pleine
     */
    private FilledRenderer(){}

    /**
     * Méthode pour dessiner un Bouncable sur un Graphics2D
     * @param g : Graphics2D sur lequel dessiner
     * @param b : Bouncable à dessiner
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.fill(b.getShape());
    }

    /**
     * Méthode pour instancier/récupérer l'instance du singleton de FilledRenderer
     * @return L'instance du singleton FilledRenderer
     */
    public static FilledRenderer getInstance() {
        if (instance == null)
            instance = new FilledRenderer(); // instanciation retardée
        return instance;
    }
}
