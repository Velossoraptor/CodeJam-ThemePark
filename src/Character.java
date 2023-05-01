import javax.swing.*;
import java.awt.*;

public class Character {
    private static ImageIcon sprite = new ImageIcon("src/sprite.png");
    private String name;
    private int coins = 0;
    private int x, y;

    public Character(String newName, JFrame currentPanel){
        this.name=newName;
        currentPanel.add(this);
    }

    public void move(int xChange, int yChange){
        this.x+=xChange;
        this.y+=yChange;
    }

    public String getName(){
        return this.name;
    }

    public int getCoins(){
        return this.coins;
    }
}
