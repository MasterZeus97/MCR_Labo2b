package Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Display implements Displayer {
    private static Display instance;
    private JFrame frame;
    private JPanel jPanel;
    //private Graphics2D graph1, graph2;
    private Image image, imageTemp;

    private Display() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(200, 200));

        //tmp = new JPanel();
        jPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
                //g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        };

        //tmp = new JPanel();
        /*jPanel.setSize(200, 200);
        jPanel.setPreferredSize(new Dimension(200, 200));*/

        frame.add(jPanel);
       //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //graph1 = (Graphics2D)jPanel.getGraphics();

        imageTemp = jPanel.createImage(jPanel.getWidth(), jPanel.getHeight());
        image = jPanel.createImage(jPanel.getWidth(), jPanel.getHeight());
        //tmp2 = (Graphics2D) tmp.createImage(tmp.getWidth(), tmp.getHeight()).getGraphics();
        //tmp2 = (Graphics2D) tmp.getGraphics();
    }

    public static Display getInstance() {
        if (instance == null)
            instance = new Display(); // instanciation retardée
        return instance;
    }

    @Override
    public int getWidth() {
        return jPanel.getWidth();
        //return frame.getContentPane().getWidth();
    }

    @Override
    public int getHeight() {
        return jPanel.getHeight();
        //return frame.getContentPane().getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) imageTemp.getGraphics();
        //return tmp2;
        //return (Graphics2D) frame.getContentPane().getGraphics();
        //return (Graphics2D) tmp.createImage(getWidth(), getHeight()).getGraphics();
        //return (Graphics2D) jPanel.getGraphics();
        //return graph1;
    }

    @Override
    public void repaint() {

        //frame.getContentPane().paintComponents(getGraphics());
        //tmp.paintComponents(tmp2);
        //tmp.paintComponents(image.getGraphics());
        //image = tmp.createImage(getWidth(), getHeight());
/*
        Graphics g2 = jPanel.getGraphics();
        g2.drawImage(image, 0, 0, null);
        g2.dispose();*/
        image = imageTemp;
        imageTemp = jPanel.createImage(jPanel.getWidth(), jPanel.getHeight());
        jPanel.repaint();
        //graph1 = (Graphics2D)jPanel.getGraphics();
        //tmp.repaint();
        //image = tmp.createImage(getWidth(), getHeight());
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
