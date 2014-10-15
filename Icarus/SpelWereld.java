import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpelWereld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpelWereld extends World
{
    private int timer;
    private int randomNumber;
    /**
     * Constructor for objects of class SpelWereld.
     * 
     */
    public SpelWereld()
    {    
        // Create a new world with 800x500 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        addObject(new Icarus(), 100, 250);
        addObject(new Spawner(), 0, 0);
        addObject(new BackButton(), 750, 480);

    }
    

             
}
