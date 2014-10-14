import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wolk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolk extends Obstacle
{
    /**
     * Act - do whatever the Wolk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-speed);
        DeleteAfterUse();
    }    
}
