package Shapes;

import Display.Display;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe abstraite AbstractShapes, cette classe implémente l'interface Bouncable représentant des formes pouvants rebondir.
 * Cette classe met en place
 *      - Un constructeur permettant l'initialisation aléatoire des valeurs de la forme (Taille, position initiale et
 *        vitesse).
 *      - Une surcharge de la méthode move() qui calcule le déplacement et le rebond de la forme
 *
 * @author Thibault Seem
 * @date 01.04.2023
 */
public abstract class AbstractShapes implements Bouncable{
    protected int size;
    protected int posX, posY;
    protected int speedX, speedY;
    protected final Color color;

    /**
     * Constructeur de forme initialisant les attributs de taille, de position et de déplacement aléatoirement
     */
    public AbstractShapes(Color color) {
        size = ThreadLocalRandom.current().nextInt(5, 20);
        posX = ThreadLocalRandom.current().nextInt(0, Display.getInstance().getWidth() - size);
        posY = ThreadLocalRandom.current().nextInt(0, Display.getInstance().getHeight() - size);
        speedX = ThreadLocalRandom.current().nextInt(-5, 5);
        speedY = ThreadLocalRandom.current().nextInt(-5, 5);
        this.color = color;
    }

    /**
     * Méthode permettant de calculer le déplacement et le rebond de la forme.
     */
    @Override
    public void move() {
        posX += speedX;
        posY += speedY;

        if(posX < 0) {
            posX = -posX;
            speedX *= -1;
        }else if((posX + size) > Display.getInstance().getWidth()){
            posX = 2 * (Display.getInstance().getWidth() - size) - posX;
            speedX *= -1;
        }

        if(posY < 0){
            posY = -posY;
            speedY *= -1;
        }else if((posY + size) > Display.getInstance().getHeight()){
            posY = 2 * (Display.getInstance().getHeight() - size) - posY;
            speedY *= -1;
        }
    }

    /**
     * Méthode permettant d'obtenir la couleur de la forme
     * @return Couleur de la forme
     */
    @Override
    public Color getColor() {
        return color;
    }
}
