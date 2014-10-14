import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolfijn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolfijn extends Obstacle
{
    public Dolfijn()
    {
        turn(90);
    }    
    /**
     * Act - do whatever the Dolfijn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-speed);
        turn(-1);
        DeleteAfterUse();
        
    }    
}
