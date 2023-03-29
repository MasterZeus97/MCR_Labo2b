package Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class Display implements Displayer {
    private static Display instance;
    private JFrame frame;
    private JPanel jPanel;
    private Image image, imageTemp;

    private Display() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(200, 200));

        jPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
            }
        };


        frame.add(jPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        imageTemp = jPanel.createImage(jPanel.getWidth(), jPanel.getHeight());
        image = jPanel.createImage(jPanel.getWidth(), jPanel.getHeight());
    }

    public static Display getInstance() {
        if (instance == null)
            instance = new Display(); // instanciation retardée
        return instance;
    }

    @Override
    public int getWidth() {
        return jPanel.getWidth();
    }

    @Override
    public int getHeight() {
        return jPanel.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) imageTemp.getGraphics();
    }

    @Override
    public void repaint() {
        image = imageTemp;
        imageTemp = jPanel.createImage(jPanel.getWidth(), jPanel.getHeight());
        jPanel.repaint();
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }


}
