import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De dolfijn springt met een boog vanaf de onderkant van het scherm.
 */
public class Dolfijn extends Obstakel
{
    public Dolfijn()
    {
        turn(90);
    }    
    /**
     * Act - do whatever the Dolfijn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-speed);
        turn(-1);
        DeleteAfterUse();
        
    }    
}
