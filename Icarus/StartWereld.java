import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWereld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWereld extends World
{
  
    /**
     * Constructor for objects of class SpelWereld.
     * 
     */
    public StartWereld()
    {    
        // Create a new world with 800x500 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        
        addObject(new SpelButton(), 320, 150);
        addObject(new CreditButton(), 320, 250);
        addObject(new HighscoreButton(), 320, 350);
    }
}
