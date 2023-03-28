package Geom;

import Display.Display;

import java.awt.*;

public class FilledCarre extends Carre {
    public FilledCarre(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        super.draw();
        Graphics2D g2 = Display.getInstance().getGraphics();
        /*g2.setColor(g2.getBackground());
        g2.fillRect(posX, posY, size, size);*/

        /*posY += speedY;
        posX += speedX;*/

        g2.setColor(getColor());
        g2.draw(getShape());
        /*g2.setColor(getColor());
        g2.fillRect(posX, posY, size, size);*/
        //Display.getInstance().repaint();

    }
}
