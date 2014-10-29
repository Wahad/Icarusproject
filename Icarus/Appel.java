import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De appel beweegt net zoals de dolfijn, en is 100 punten waard.
 */
public class Appel extends PuntenObject
{
    public Appel()
    {
        turn(90);
    }    
    /**
     * Act - do whatever the Appel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(-speed);
       turn(-1);
       punten();
       
    }    
    
    /**
     * Deze methode werkt net zoals de punten() methode in de superklasse PuntenObject,
     * maar slaat ook het aantal verzamelde appels op in Icarus zodat ze uiteindelijk 
     * bij de score kunnen worden opgeteld.
     */
    
    public void punten()
    {
        Actor a = getOneIntersectingObject(Icarus.class);
        if(a != null)
        {
            Icarus.Appels++;
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
