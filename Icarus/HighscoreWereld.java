import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighscoreWereld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighscoreWereld extends World
{

    /**
     * Constructor for objects of class HighscoreWereld.
     * 
     */
    public HighscoreWereld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        addObject(new BackButton(), 590, 460);
    }
}