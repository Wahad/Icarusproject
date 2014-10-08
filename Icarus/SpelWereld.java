import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpelWereld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpelWereld extends World
{

    /**
     * Constructor for objects of class SpelWereld.
     * 
     */
    public SpelWereld()
    {    
        // Create a new world with 800x500 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        ObstacleSpawn();
    }
    
    /** 
     * De methode om obstakels in de wereld te zetten.
     */
    public void ObstacleSpawn()
    {
        addObject(new Dolfijn(), Greenfoot.getRandomNumber(400)+400, 490);
        addObject(new Wolk(), 800, Greenfoot.getRandomNumber(50)+Greenfoot.getRandomNumber(400) );
        addObject(new Bliksem(), Greenfoot.getRandomNumber(400)+400, 10);
        addObject(new Vogel(), 800, Greenfoot.getRandomNumber(50)+Greenfoot.getRandomNumber(400) );
        
          
    }    
}
