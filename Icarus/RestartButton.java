import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Deze knop zorgt ervoor dat je het spel opnieuw kan spelen als je dood bent gegaan zonder dat je terug naar het 
 * hoofdmenu hoeft te gaan.
 */
public class RestartButton extends Button
{
    /**
     * Act - do whatever the RestartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new SpelWereld());  
        }  
    }    
}
