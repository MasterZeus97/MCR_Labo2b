package Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * Classe Display, implémentant l'interface Displayer. Défini un singleton créant un JFrame, permettant d'afficher une image,
 * d'en récupérer son graphic, d'ajouter un keylistener et de raffraichir l'image.
 */
public class Display implements Displayer {
    private static Display instance;
    private final JFrame frame;
    private final JPanel jPanel;
    private Image image, imageTemp;

    /**
     * Constructeur du display
     */
    private Display() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(200, 200));
        frame.setMinimumSize(new Dimension(100, 50));
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

        imageTemp = jPanel.createImage(getWidth(), getHeight());
        image = jPanel.createImage(getWidth(), getHeight());
    }

    /**
     * Méthode pour instancier/récupérer l'instance du singleton de Display
     * @return L'instance du singleton Display
     */
    public static Display getInstance() {
        if (instance == null)
            instance = new Display(); // instanciation retardée
        return instance;
    }

    /**
     * Méthode pour obtenir la largeur de l'affichage
     * @return La largeur de l'affichage
     */
    @Override
    public int getWidth() {
        return jPanel.getWidth();
    }

    /**
     * Méthode pour obtenir la hauteur de l'affichage
     * @return La hauteur de l'affichage
     */
    @Override
    public int getHeight() {
        return jPanel.getHeight();
    }

    /**
     * Méthode pour obtenir le Graphics2D de l'image affichée
     * @return Le Graphics2D de l'image affichée
     */
    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) imageTemp.getGraphics();
    }

    /**
     * Méthode pour actualiser l'affichage avec le graphics de la méthode getGraphics
     */
    @Override
    public void repaint() {
        image = imageTemp;
        imageTemp = jPanel.createImage(getWidth(), getHeight());
        jPanel.repaint();
    }

    /**
     * Méthode pour modifier le nom de la fenêtre créée
     * @param title : String du titre de la fenêtre
     */
    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    /**
     * Méthode pour ajouter un keyAdapter au keyListener du JFrame
     * @param ka : KeyAdapter à ajouter au keyListener du JFrame
     */
    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }


}
