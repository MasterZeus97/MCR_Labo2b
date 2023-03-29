package Geom;

import Display.Display;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Forme implements Bouncable{
    protected int size;
    protected double radius = size/2.0;
    protected int posX, posY;
    protected int speedX, speedY;

    public Forme(int height, int width) {
        size = ThreadLocalRandom.current().nextInt(5, 20);
        posX = ThreadLocalRandom.current().nextInt((int) Math.ceil(radius), height - (int) Math.ceil(radius));
        posY = ThreadLocalRandom.current().nextInt((int) Math.ceil(radius), width - (int) Math.ceil(radius));
        speedX = 0;//ThreadLocalRandom.current().nextInt(-5, 5);
        speedY = 1;//ThreadLocalRandom.current().nextInt(-5, 5);
    }

    public abstract void draw();

    @Override
    public void move() {
        posX += speedX;
        posY += speedY;

        if(posX < radius) {
            posX = -posX + (int) Math.ceil(radius);
            speedX *= -1;
        }else if((posX + radius) > Display.getInstance().getWidth()){
            posX = 2 * Display.getInstance().getWidth() - (posX + (int) Math.ceil(radius));
            speedX *= -1;
        }

        int tmp = Display.getInstance().getHeight();
        int tmp2 = getSize();

        if(posY < 0){
            posY = -posY + (int) Math.ceil(radius);
            speedY *= -1;
        }else if((posY + size) > Display.getInstance().getHeight()){
            posY = Display.getInstance().getHeight() - ((posY + getSize()) - Display.getInstance().getHeight());//2 * Display.getInstance().getHeight() - (posY + (int) Math.ceil(radius));
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
