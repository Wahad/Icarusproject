import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dit is de Spelwereld, waar het spel gespeeld van worden.
 */
public class SpelWereld extends World
{
    /**
     * Constructor for objects of class SpelWereld.
     * 
     */
    public SpelWereld()
    {    
        /**
         * Dit maakt de avatar van de speler aan, alsmede de Spawner, een teller voor de score, en
         * een knop om terug te gaan naar het hoofdmenu.
         */
        super(800, 500, 1); 
        addObject(new Icarus(), 100, 250);
        addObject(new Spawner(), 0, 0);
        addObject(new BackButton(), 50, 480);
        addObject(new HighscoreCounter(), 400, 25);
    }
    

             
}
