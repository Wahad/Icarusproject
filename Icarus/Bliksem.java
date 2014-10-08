import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bliksem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bliksem extends Obstacle
{
    public Bliksem() 
    {
        turn(-45);
    }    
    /**
     * Act - do whatever the Bliksem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-4);
        DeleteAfterUse();
    }    
}
