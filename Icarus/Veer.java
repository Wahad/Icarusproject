import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Veer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Veer extends PuntenObject
{
    public Veer()
    {
        turn(-45);
    }
    /**
     * Act - do whatever the Veer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-speed);
        punten();
    }    
    
    public void punten()
    {
        Actor a = getOneIntersectingObject(Icarus.class);
        if(a != null)
        {
            Icarus.Veren = Icarus.Veren++;
            World world = getWorld();
            world.removeObject(this);
        }
        else
        {
            int x = getX();
            int y = getY();

            if (x == 0)
            {
                World world = getWorld();
                world.removeObject(this);
            }
            else if (y > 490)
            {
                World world = getWorld();
                world.removeObject(this);
            }
        }
    }
}
