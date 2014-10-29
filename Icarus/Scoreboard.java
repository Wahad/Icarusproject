import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Het scoreboard geeft de totale score aan na de dood van Icarus, door de tijd-score te voegen bij de
 * waardes van de Puntenobjecten die verzameld zijn. 
 */
public class Scoreboard extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Scoreboard()
    {
        background = getImage();  // get image from class
        updateImage();
    }
    
    public void act() 
    {
        
    }    
    
    /**
     * Deze methode geeft de totale waarde van de score aan op het scherm.
     */
    
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage("Your final score is: " + HighscoreCounter.FinalScore, 22, Color.WHITE, transparent);
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
