package Geom;

import Display.Display;
import Geom.Renderer.Renderer;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Forme implements Bouncable{
    protected int size;
    protected double radius;
    protected int posX, posY;
    protected int speedX, speedY;
    protected Renderer renderer;

    public Forme() {
        size = ThreadLocalRandom.current().nextInt(5, 20);
        posX = ThreadLocalRandom.current().nextInt((int) Math.ceil(radius), Display.getInstance().getHeight() - (int) Math.ceil(radius));
        posY = ThreadLocalRandom.current().nextInt((int) Math.ceil(radius), Display.getInstance().getWidth() - (int) Math.ceil(radius));
        speedX = ThreadLocalRandom.current().nextInt(-5, 5);
        speedY = ThreadLocalRandom.current().nextInt(-5, 5);
        radius = size/2.0;
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

        if(posY < radius){
            posY = -posY + (int) Math.ceil(radius);
            speedY *= -1;
        }else if((posY + radius) > Display.getInstance().getHeight() && speedY > 0){
            posY = 2 * Display.getInstance().getHeight() - (posY + (int) Math.ceil(radius));//Display.getInstance().getHeight() - ((posY + getSize()) - Display.getInstance().getHeight());//2 * Display.getInstance().getHeight() - (posY + (int) Math.ceil(radius));
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
