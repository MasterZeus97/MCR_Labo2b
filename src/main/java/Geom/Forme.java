package Geom;

import Display.Display;
import Geom.Renderer.Renderer;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Forme implements Bouncable{
    protected int size;
    protected double radius;
    protected int posX, posY;
    protected int speedX, speedY;
    protected Renderer renderer;

    public Forme() {
        size = ThreadLocalRandom.current().nextInt(5, 20);
        posX = ThreadLocalRandom.current().nextInt(0, Display.getInstance().getHeight() - size);
        posY = ThreadLocalRandom.current().nextInt(0, Display.getInstance().getWidth() - size);
        speedX = ThreadLocalRandom.current().nextInt(-5, 5);
        speedY = ThreadLocalRandom.current().nextInt(-5, 5);
        radius = size/2.0;
    }

    public abstract void draw();

    @Override
    public void move() {
        posX += speedX;
        posY += speedY;

        if(posX < 0) {
            posX = -posX + (int) Math.ceil(radius);
            speedX *= -1;
        }else if((posX + radius) > Display.getInstance().getWidth()){
            posX = 2 * (Display.getInstance().getWidth() - size) - posX;
            speedX *= -1;
        }

        if(posY < 0){
            posY = -posY;
            speedY *= -1;
        }else if((posY + size) > Display.getInstance().getHeight() && speedY > 0){
            posY = 2 * (Display.getInstance().getHeight() - size) - posY;
            speedY *= -1;
        }
    }

    protected int getSize() {
        return size;
    }

    protected int getPosX() {
        return posX;
    }

    protected int getPosY() {
        return posY;
    }
}
