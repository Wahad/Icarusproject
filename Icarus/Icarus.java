import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Icarus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Icarus extends Actor
{
    private int GravityInEffect = 1;
    private int Gravity = 1;
    private int Initiate;
    private int Counter;
    private GreenfootImage image1;
    private GreenfootImage image2;
    public static boolean isDead;
    
    /**
     * Act - do whatever the Icarus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Icarus()
    {
        image1 = new GreenfootImage("IcarusSprite1.png");
        image2 = new GreenfootImage("IcarusSprite2.png");
        isDead=false;
    }
    
    public void act() 
    {
        Initiate++;
        gravity();
        wings();
        collision();
    }    
    
    private void gravity()
    {
        if(Initiate >=20)
        {
            if(GravityInEffect == 1)
            {
                if(Greenfoot.isKeyDown("space"))
                {
                    setLocation(getX(), getY() - 4);
                    Gravity = 1;
                } else {
                    setLocation(getX(), getY() + Gravity);
                    Counter++;
                    if(Counter == 5)
                    {
                        Gravity = Gravity + 1;
                        Counter = 0;
                    }
                }
            }
        }
    }
    
    private void wings()
    {
        
        if (Greenfoot.isKeyDown("space"))
        {
            setImage(image1);
            
        }
        else
        {
            setImage(image2);
            
        }    
    }
    private void collision()
    {
           int y = getY();
           Actor a = getOneIntersectingObject(Obstakel.class);
           if( a != null)
           {
                World world = getWorld();
                world.removeObject(this);
                isDead=true;
           }
           else if (y == 0)
           {
               World world = getWorld();
               world.removeObject(this);
               isDead=true;
           }
           else if (y >= 495)
           {
               World world = getWorld();
               world.removeObject(this);
               isDead=true;
           }
    }
    
}
