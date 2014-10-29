import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De bliksem beweegt van rechtsboven naar linksbeneden.
 */
public class Bliksem extends Obstakel
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
        move(-speed);
        DeleteAfterUse();
    }    
}
