import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dit is het menu van de credits, waar mensen kunnen zien wie het spel gemaakt heeft.
 */
public class CreditWereld extends World
{

    /**
     * Constructor for objects of class CreditWereld.
     * 
     */
    public CreditWereld()
    {    
        // Dit voegt ook een knop toe on terug te gaan naar het hoofdmenu.
        super(640, 480, 1); 
        addObject(new BackButton(), 50, 460);
    }
}
