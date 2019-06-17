import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUITest {
     public static JButton createButtonImage (JButton button, String src){
        BufferedImage myPicture = null;
        Image newimg = null;

        try {
            myPicture = ImageIO.read(new File(src));
            newimg = myPicture.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;

        } catch (IOException e) {
            e.printStackTrace();
        }
        button.setIcon(new ImageIcon(newimg));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);
        return button;
    }

    public static GridBagConstraints createGridConstraints(GridBagConstraints c, int constraints, int gridx, int gridy){
         c.fill = constraints;
         c.gridx = gridx;
         c.gridy = gridy;
         return c;
    }

    public static void addComponentsToPane(Container pane) {
        JButton button;
        JLabel label;
        JPanel panel;
        JTextField textField;
        GridBagConstraints c;

        pane.setLayout(new GridBagLayout());
        c = new GridBagConstraints();

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 0);

        button = new JButton();
        createButtonImage(button,"src/Pictos/FKTloeschen.png");
        panel.add(button);

        textField = new JTextField();
       // createGridConstraints(c, GridBagConstraints.NORTHWEST, 1, 0 );
        panel.add(textField);

        pane.add(panel, c);

        button = new JButton();
        createButtonImage(button,"src/Pictos/und.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 1);
        pane.add(button, c);

        label = new JLabel("und");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 2);
        pane.add(label, c);


        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 3);
        pane.add(Box.createVerticalStrut(10), c);

        button = new JButton();
        createButtonImage(button,"src/Pictos/ich.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 4);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            }
        });

        pane.add(button, c);

        label = new JLabel("ich");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 5);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 6);
        pane.add(Box.createVerticalStrut(10), c);


        button = new JButton();
        createButtonImage(button,"src/Pictos/du.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 7);
        pane.add(button, c);

        label = new JLabel("du");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 8);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 9);
        pane.add(Box.createVerticalStrut(10), c);


        button = new JButton();
        createButtonImage(button,"src/Pictos/wir.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 10);
        pane.add(button, c);

        label = new JLabel("wir");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 11);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 12);
        pane.add(Box.createVerticalStrut(10), c);

        button = new JButton();
        createButtonImage(button,"src/Pictos/das.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 13);
        pane.add(button, c);

        label = new JLabel("das");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 14);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0 , 15);
        pane.add(Box.createVerticalStrut(10), c);


    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ELKO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}