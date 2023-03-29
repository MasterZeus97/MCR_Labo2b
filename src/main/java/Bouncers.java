import Display.Display;
import Geom.Bouncable;
import Geom.Factories.FilledFactory;
import Geom.Factories.FormeFactories;
import Geom.Factories.HollowFactory;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Bouncers {
    private LinkedList<Bouncable> bouncers;
    private FormeFactories filled;
    private FormeFactories hollow;

    public Bouncers() {
        bouncers = new LinkedList<>();
        filled = new FilledFactory();
        hollow = new HollowFactory();
        /* … */
    }
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
