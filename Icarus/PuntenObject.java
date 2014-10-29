import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dit is de superklasse voor de objecten die verzameld kunnen worden voor bonuspunten.
 */
public class PuntenObject extends Actor
{
    public static int speed = 4;
    /**
     * Act - do whatever the PuntenObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        punten();
    } 

    /**
     * Deze methode kijkt of Icarus met een Puntenobject heeft gebotst, en zo ja, dan haalt hij het object uit de
     * wereld. Als Icarus niet met een object heeft gebotst, haalt de methode het object weg als hij de rand
     * van de wereld heeft bereikt.
     */
    public void punten()
    {
        Actor a = getOneIntersectingObject(Icarus.class);
        if(a != null)
        {
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
