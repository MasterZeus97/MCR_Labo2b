package Geom;

import Display.Display;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Forme implements Bouncable{
    protected int size;
    protected int posX, posY;
    protected int speedX, speedY;
    protected Shape shape;

    public Forme(int height, int width) {
        size = ThreadLocalRandom.current().nextInt(5, 20);
        posX = ThreadLocalRandom.current().nextInt(0, height - size);
        posY = ThreadLocalRandom.current().nextInt(0, width - size);
        speedX = ThreadLocalRandom.current().nextInt(-5, 5);
        speedY = ThreadLocalRandom.current().nextInt(-5, 5);
    }

    public abstract void draw();

    @Override
    public void move() {
        posX += speedX;
        posY += speedY;

        if(posX < 0) {
            posX = -posX;
            speedX *= -1;
        }else if((posX + size) > Display.getInstance().getWidth()){
            posX = 2 * Display.getInstance().getWidth() - (posX + size);
            speedX *= -1;
        }

        if(posY < 0){
            posY = -posY;
            speedY *= -1;
        }else if((posY + size) > Display.getInstance().getHeight()){
            posY = 2 * Display.getInstance().getHeight() - (posY + size);
            speedY *= -1;
        }
    }

    /*
    protected void checkColision(){

        if((posX < 0) || (posX + size) > Display.getInstance().getWidth())
            speedX *= -1;

        if((posY < 0) || (posY + size) > Display.getInstance().getHeight())
            speedY *= -1;
        /*if((posX < 0)){
            posX = 0;
            speedX *= -1;
        }else if((posX + size) > Display.getInstance().getWidth()){
            posX = Display.getInstance().getWidth();
            speedX *= -1;
        }


        if((posY < 0)){
            posY = 0;
            speedY *= -1;
        }else if((posY + size) > Display.getInstance().getHeight()){
            posY = Display.getInstance().getHeight();
            speedY *= -1;
        }
    }*/

    protected int getSize() {
        return size;
    }

    protected int getPosX() {
        return posX;
    }

    protected int getPosY() {
        return posY;
    }

    protected int getSpeedX() {
        return speedX;
    }

    protected int getSpeedY() {
        return speedY;
    }
}
