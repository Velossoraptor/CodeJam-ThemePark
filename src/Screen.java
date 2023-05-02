import javax.swing.*;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;

public class Screen {
    //frame of the game
    private JFrame game = new JFrame();
    //tabbed pane to switch maps
    private JTabbedPane gameScreen = new JTabbedPane();
    //map
    private ImageIcon tabIcon = new ImageIcon("src/sprite.png");
    //panel 
    private JPanel main = new JPanel();
    private JPanel game1 = new JPanel();
    private JPanel game2 = new JPanel();
    private JPanel game3 = new JPanel();
    private JPanel game4 = new JPanel();
    //label to contain image
    private JLabel main1 = new JLabel();
    private JLabel lGame1 = new JLabel();
    private JLabel lGame2 = new JLabel();
    private JLabel lGame3 = new JLabel();
    private JLabel lGame4 = new JLabel();

    public Screen(){
        main1.setIcon(tabIcon);
        main.add(main1);
        game1.add(lGame1);
        game2.add(lGame2);
        game3.add(lGame3);
        game4.add(lGame4);

        game.setSize(1420,1000);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.getContentPane().setBackground(Color.black);

        gameScreen.addTab("Main Map", main);
        gameScreen.addTab("game 1", game1);
        gameScreen.addTab("2", game2);
        gameScreen.addTab("3", game3);
        gameScreen.addTab("4", game4);
        //Set these to occur after each game is completed
        // gameScreen.addTab("Mini Game 1");
        // gameScreen.addTab("Mini game 2");
        // gameScreen.addTab("Mini game 3");
        // gameScreen.addTab("Mini game 4");

        game.add(gameScreen);


        game.setVisible(true);
    }
}
