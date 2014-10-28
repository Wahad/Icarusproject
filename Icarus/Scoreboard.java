import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

public class Scoreboard extends Actor
{
   //Properties ...
   private int score;
   private String text;
    public void act() 
    {
        
    }    
    public Scoreboard(String label)
    {
        GreenfootImage img = new GreenfootImage(300,40);
        img.setColor(Color.WHITE);
        Font f=new Font("Comic Sans MS",Font.BOLD,24);
        img.setFont(f);
        img.drawString(label + ": " + HighscoreCounter.FinalScore, 5, 35);
        setImage(img);
        text=label;
        score=HighscoreCounter.FinalScore;
    }
    
   
    public int getScore()
    {
        return score;
    }
    
   
}