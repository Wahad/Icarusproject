import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Deze knop zorgt ervoor dat je terug naar het hoofdmenu kan gaan.
 */
public class BackButton extends Button
{
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new StartWereld());  
        }  
    }    
}
