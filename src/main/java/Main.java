import Display.Displayer;
import Display.Display;
import Geom.Bouncable;
import Geom.Carre;
import Geom.Forme;
import Geom.Rond;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int nbFormes = 20;
        ArrayList<Bouncable> formList = new ArrayList<>();

        Displayer tmp = Display.getInstance();

        for(int i = 0; i < nbFormes; i++){
            if(i%2 == 0){
                formList.add(new Rond(tmp.getHeight(), tmp.getWidth()));
            }else{
                formList.add(new Carre(tmp.getHeight(), tmp.getWidth()));
            }
        }


        while(true){
            TimeUnit.MILLISECONDS.sleep(10);
            for(Bouncable x : formList){
                //x.draw(tmp.getGraphics());
                x.draw();
                x.move();
            }
            tmp.repaint();
        }/*
        Timer drawTimer = new Timer(10, e -> {
            for(Forme x : formList){
                //x.draw(tmp.getGraphics());
                x.draw();
            }
            tmp.repaint();
        });
        drawTimer.setInitialDelay(10);
        drawTimer.start();*/

    }
}
