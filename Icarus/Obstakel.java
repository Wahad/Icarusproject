import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dit is de superklasse van de obstakels die moeten worden ontweken.
 */
public class Obstakel extends Actor
{
    public static int speed=2;
 
    public void act() 
    { 
        DeleteAfterUse();
    }
    
    /**
     * Deze methode zorgt ervoor dat de objecten verdwijnen als ze 
     * het einde van de wereld raken zonder Icarus te hebben geraakt.
     */
    
    public void DeleteAfterUse()
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
