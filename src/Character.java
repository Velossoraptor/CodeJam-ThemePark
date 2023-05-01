import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Character implements KeyListener{
    private static ImageIcon sprite = new ImageIcon("src/sprite.png");
    private String name;
    private int coins = 0;
    private int lives = 3;
    private int x, y;

    public Character(String newName, JPanel currentPanel){
        this.name=newName;
        currentPanel.add(this); //probably move to a different class/function
    }

    //Change Methods
    public void move(int xChange, int yChange){
        this.x+=xChange;
        this.y+=yChange;
    }

    public void loseLife(){
        this.lives--;
    }

    public void gainCoin(){
        this.coins++;
    }

    //Getter Methods
    public String getName(){
        return this.name;
    }

    public int getCoins(){
        return this.coins;
    }

    public int getLives(){
        return this.lives;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}
