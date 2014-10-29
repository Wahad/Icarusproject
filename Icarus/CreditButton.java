import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Deze knop zorgt ervoor dat je het menu van de credits kan bereiken.
 */
public class CreditButton extends Button
{
    /**
     * Act - do whatever the CreditButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new CreditWereld());  
        }  
    }    
}
