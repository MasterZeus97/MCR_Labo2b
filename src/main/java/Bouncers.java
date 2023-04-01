import Display.Display;
import Shapes.Bouncable;
import Shapes.Factories.FilledFactory;
import Shapes.Factories.ShapeFactories;
import Shapes.Factories.HollowFactory;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 * Classe Bouncers, contenant le main du programme. La création des formes est effectué dans cette classe.
 *
 * @author Thibault Seem
 * @date 01.04.23
 */
public class Bouncers {
    private LinkedList<Bouncable> bouncers;
    private ShapeFactories filled;
    private ShapeFactories hollow;

    /**
     * Constructeur de la classe Bouncers
     */
    public Bouncers() {
        bouncers = new LinkedList<>();
        filled = new FilledFactory();
        hollow = new HollowFactory();
    }

    /**
     * Cette méthode permet de faire fonctionner l'affichage.
     */
    public void run() {
        Display.getInstance().setTitle("Labo2b");
        Display.getInstance().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyChar() == 'e') {
                    bouncers.clear();
                }
                if (e.getKeyChar() == 'b') {
                    for(int i = 0; i < 10; ++i){
                        bouncers.add(hollow.createCircle());
                        bouncers.add(hollow.createSquare());
                    }
                }
                if (e.getKeyChar() == 'f') {
                    for(int i = 0; i < 10; ++i){
                        bouncers.add(filled.createCircle());
                        bouncers.add(filled.createSquare());
                    }
                }
                if (e.getKeyChar() == 'q') {
                    System.exit(0);
                }
            }
        });

        Timer drawTimer = new Timer(10, e -> {
            for(Bouncable x : bouncers){
                x.draw();
                x.move();
            }
            Display.getInstance().repaint();
        });
        drawTimer.setInitialDelay(10);
        drawTimer.start();
    }
    public static void main(String ... args) {
        new Bouncers().run();
    }
}
