package Shapes.Renderer;

import Shapes.Bouncable;

import java.awt.*;

/**
 * Classe HollowRenderer, cette classe implémente l'interface Renderer. Cette classe met un place un singleton et
 * implémente la méthode display pour une forme vide
 */
public class HollowRenderer implements Renderer {
    private static HollowRenderer instance;

    /**
     * Constructeur privé pour le renderer de forme vide
     */
    private HollowRenderer(){};

    /**
     * Méthode pour dessiner un Bouncable sur un Graphics2D
     * @param g : Graphics2D sur lequel dessiner
     * @param b : Bouncable à dessiner
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }

    /**
     * Méthode pour instancier/récupérer l'instance du singleton de HollowRenderer
     * @return L'instance du singleton HollowRenderer
     */
    public static HollowRenderer getInstance() {
        if (instance == null)
            instance = new HollowRenderer(); // instanciation retardée
        return instance;
    }
}
