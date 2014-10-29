import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De veer beweegt net zoals de bliksem.
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
    /**
     * Deze methode werkt net zoals de punten() methode in de superklasse PuntenObject,
     * maar slaat ook het aantal verzamelde veren op in Icarus zodat ze uiteindelijk 
     * bij de score kunnen worden opgeteld.
     */
    public void punten()
    {
        Actor a = getOneIntersectingObject(Icarus.class);
        if(a != null)
        {
            Icarus.Veren++;
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
