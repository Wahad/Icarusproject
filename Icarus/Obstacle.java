import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wolk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{

    public void act() 
    { 
        DeleteAfterUse();
    }
    
    public void DeleteAfterUse()
    {
        int x = getX();
        int y = getY();

        if (x == 0)
        {
            World world;
            world = getWorld();
            world.removeObject(this);
        }
        else if (y > 490)
        {
            World world;
            world = getWorld();
            world.removeObject(this);
        } 
    }    
}
