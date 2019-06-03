import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI {
       public static void main(String[] args) {
            JPanel flaeche;
            JButton knopf;
            JLabel beschriftung;
            // Aufruf des Konstruktors der Klasse JFrame und
            // Setzen der Überschrift des Hauptfensters
            JFrame derTest = new JFrame("Hauptfenster mit verschiedenen Steuerelementen");

            // Einstellen der Position und Größe des Hauptfensters
            derTest.setLocation(0,0);
            derTest.setSize(450,450);
            // Knopf erzeugen
            knopf = new JButton();
            BufferedImage myPicture = null;
            try {
                 myPicture = ImageIO.read(new File("src/download.jpg"));
            } catch (IOException e) {
                 e.printStackTrace();
            }
            knopf.setIcon(new ImageIcon(myPicture));
            //knopf.setBorder(BorderFactory.createEmptyBorder());
            knopf.setContentAreaFilled(false);

            flaeche = new JPanel();
            //flaeche.setSize(derTest.getSize());
            //flaeche.setLocation(0,0);
            flaeche.setLayout(new BorderLayout());
            // Steuerelemente zur Fläche hinzufügen
            flaeche.add(knopf);
            derTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Fläche dem Hauptfenster hinzufügen
            derTest.getContentPane().add(flaeche);
            // Hauptfenster anzeigen
            derTest.setVisible(true);
        }
}
