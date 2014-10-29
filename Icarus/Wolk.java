import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De wolk beweegt simpelweg van rechts naar links in een horizontale lijn.
 */
public class Wolk extends Obstakel
{
    /**
     * Act - do whatever the Wolk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-speed);
        DeleteAfterUse();
    }    
}
