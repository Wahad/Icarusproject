import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De spawner zorgt everoor dat alle objecten in de wereld worden gezet.
 */
public class Spawner extends Actor
{
    public static int timer;
    public int randomNumber;

    /**
     * Act - do whatever the Spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        randomSpawn();
        addSpeed();
        timer++;
        restart();
    }    

    public Spawner()
    {
        timer=0;

    }
    /**
     * Deze methode zorgt ervoor dat na een bepaalde tijd de Obstakels sneller beginnen te bewegen, om het spel wat moeilijker te maken.
     */

    public void addSpeed()
    {
        if(timer%1500==0)
        {
            Obstakel.speed++;
        }
    }

    /**
     * Deze methode zorgt ervoor dat zolang Icarus nog niet dood is, er Obstakels en Puntenobjecten in de wereld worden gezet. 
     * Dit doet de methode door via een timer, een for-loop en een willekeurig nummer om de zoveel tijd twee objecten in de wereld zet.
     */
    public void randomSpawn()
    {
        if(Icarus.isDead==false)
        {
            int i = getWorld().getObjects(null).size();
            for(i=1; i < 3; i++)
            {   
                if(timer%200==0)
                {
                    randomNumber = Greenfoot.getRandomNumber(100);
                    if(randomNumber <= 20)
                    {
                        getWorld().addObject(new Dolfijn(), Greenfoot.getRandomNumber(400)+400, 490); 
                    }
                    else if(randomNumber > 20 && randomNumber<=40)
                    {
                        getWorld().addObject(new Wolk(), 800, Greenfoot.getRandomNumber(50)+Greenfoot.getRandomNumber(400) );     
                    }
                    else if(randomNumber > 40 && randomNumber<= 50)
                    {
                        getWorld().addObject(new Bliksem(), Greenfoot.getRandomNumber(300)+100, 10);   
                    }
                    else if(randomNumber > 50 && randomNumber<= 60)
                    {
                        getWorld().addObject(new Vogel(), 795, Greenfoot.getRandomNumber(105)+200 );
                    }
                    else if(randomNumber > 60 && randomNumber<= 70)
                    {
                        getWorld().addObject(new Appel(), Greenfoot.getRandomNumber(400)+200, 490); 
                    }
                    else if(randomNumber > 70 && randomNumber<= 80)
                    {
                        getWorld().addObject(new Munt(), 800, Greenfoot.getRandomNumber(50)+Greenfoot.getRandomNumber(400) );     
                    }
                    else if(randomNumber > 90)
                    {
                        getWorld().addObject(new Veer(), Greenfoot.getRandomNumber(300)+100, 10);   
                    }
                }
            }
            
        }
    }    

    /**
     * Deze methode zet een object van de klasse Scoreboard en een herstart-knop in de wereld als Icarus dood is.
     */
    private void restart()
    {
        if(Icarus.isDead==true)
        {
            getWorld().addObject(new RestartButton(), 400, 250);
            getWorld().addObject(new Scoreboard(), 400, 320);
        }
    }  

}
