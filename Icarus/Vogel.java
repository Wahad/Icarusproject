import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vogel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vogel extends Obstacle
{
    public Vogel()
    {
        turn(55);
    }
    /**
     * Act - do whatever the Vogel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-speed);
        if(getY()>=350)
        {
            turn(55);
            move(-5);
        }
        else if(getY()<=150)
        {
            turn(-55);
            move(-5);
        } 
        DeleteAfterUse();
    }    
}
