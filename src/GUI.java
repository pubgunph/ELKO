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
            ImageIcon diceIcon = new ImageIcon(getClass().getResource("/images/DiceIcon.png"));
            knopf.setIcon(new ImageIcon("~/Documents/workspace/ELKO/Program.ico"));
            knopf.setBorder(BorderFactory.createEmptyBorder());
            //knopf.setContentAreaFilled(false);
            // Zeichenfläche erzeugen, Hintergrundfarbe und Größe
            // einstellen
            // Textzeile erzeugen
            beschriftung = new JLabel("Hier ist die Beschriftung");
            // Kombinationsfeld erzeugen und fünf Einträge hinzufügen

            flaeche = new JPanel();
            //flaeche.setSize(derTest.getSize());
            //flaeche.setLocation(0,0);
            //flaeche.setLayout(new GridLayout(2,1));
            // Steuerelemente zur Fläche hinzufügen
            flaeche.add(knopf);
            //flaeche.add(beschriftung);
            derTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Fläche dem Hauptfenster hinzufügen
            derTest.getContentPane().add(flaeche);
            // Hauptfenster anzeigen
            derTest.setVisible(true);
        }
}
