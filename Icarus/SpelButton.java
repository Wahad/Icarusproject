import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Deze knop zorgt ervoor dat je het spel kan bereiken en spelen.
 */
public class SpelButton extends Button
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
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
