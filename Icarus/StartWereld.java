import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Het hoofdmenu. Hieruit zijn het spel en de credits 
 * te bereiken.
 */
public class StartWereld extends World
{
  
    /**
     * Constructor for objects of class SpelWereld.
     * 
     */
    public StartWereld()
    {    
        /** Dit maakt een nieuw hoofdmenu aan met knoppen om het spel en de credits
        * te bereiken.
        */ 
        super(640, 480, 1); 
        
        addObject(new SpelButton(), 320, 150);
        addObject(new CreditButton(), 320, 250);

    }
}
