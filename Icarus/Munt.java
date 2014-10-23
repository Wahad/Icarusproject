import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Munt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Munt extends PuntenObject
{
    /**
     * Act - do whatever the Munt wants to do. This method is called whenever
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
            Icarus.Munten = Icarus.Munten++;
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
