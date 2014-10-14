import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpelWereld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpelWereld extends World
{
    private int timer;
    private int randomNumber;
    /**
     * Constructor for objects of class SpelWereld.
     * 
     */
    public SpelWereld()
    {    
        // Create a new world with 800x500 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        //obstacleSpawn();
        addObject(new Spawner(), 0, 0);
        
    }
    

    /** 
     * De methode om obstakels in de wereld te zetten.
     */
    public void obstacleSpawn()
    {
        addObject(new Dolfijn(), Greenfoot.getRandomNumber(400)+400, 490);
        addObject(new Wolk(), 800, Greenfoot.getRandomNumber(50)+Greenfoot.getRandomNumber(400) );
        addObject(new Bliksem(), Greenfoot.getRandomNumber(500)-100, 10);
        addObject(new Vogel(), 795, Greenfoot.getRandomNumber(155)+150 );
        addObject(new Icarus(), 100, 250);

    }    

    public void randomSpawn ()
    {
        timer=0;
        timer++;
        if(timer%10==0)
        {
            randomNumber = Greenfoot.getRandomNumber(3);
            if(randomNumber==0)
            {
                addObject(new Dolfijn(), Greenfoot.getRandomNumber(400)+400, 490); 
            }
            else if(randomNumber==1)
            {
                addObject(new Wolk(), 800, Greenfoot.getRandomNumber(50)+Greenfoot.getRandomNumber(400) );     
            }
            else if(randomNumber==2)
            {
                addObject(new Bliksem(), Greenfoot.getRandomNumber(500)-100, 10);   
            }
            else if(randomNumber==3)
            {
                addObject(new Vogel(), 795, Greenfoot.getRandomNumber(155)+150 );
            }           
        }
    }
}
