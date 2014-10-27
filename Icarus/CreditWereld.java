import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditWereld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditWereld extends World
{

    /**
     * Constructor for objects of class CreditWereld.
     * 
     */
    public CreditWereld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        addObject(new BackButton(), 50, 460);
    }
}
