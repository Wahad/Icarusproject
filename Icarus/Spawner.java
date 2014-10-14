import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    public int timer;
    public int randomNumber;
    /**
     * Act - do whatever the Spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        randomSpawn();
        
        timer++;
    }    
    public Spawner()
    {
        timer=0;
    }
   
    public void randomSpawn ()
    {
        
        if(timer%150==0)
        {
            randomNumber = Greenfoot.getRandomNumber(4);
            if(randomNumber==0)
            {
                getWorld().addObject(new Dolfijn(), Greenfoot.getRandomNumber(400)+400, 490); 
            }
            else if(randomNumber==1)
            {
                getWorld().addObject(new Wolk(), 800, Greenfoot.getRandomNumber(50)+Greenfoot.getRandomNumber(400) );     
            }
            else if(randomNumber==2)
            {
                getWorld().addObject(new Bliksem(), Greenfoot.getRandomNumber(500)-100, 10);   
            }
            else if(randomNumber==3)
            {
                getWorld().addObject(new Vogel(), 795, Greenfoot.getRandomNumber(155)+150 );
            }           
        }
    }
}
