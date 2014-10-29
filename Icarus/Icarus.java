 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Icarus is de avatar van de speler, die zoveel mogelijk Obstakels moet
 * ontwijken en zoveel mogelijk Puntenobjecten moet verzamelen.
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
    public static int Appels;
    public static int Munten;
    public static int Veren;
    
    
    
    /**
     * Act - do whatever the Icarus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Icarus()
    {
        image1 = new GreenfootImage("IcarusSprite1.png");
        image2 = new GreenfootImage("IcarusSprite2.png");
        isDead=false;
        Spawner.timer = 0;
        Obstakel.speed = 2;
        Appels = 0;
        Munten = 0;
        Veren = 0;
        
       
    }
    
    public void act() 
    {
        Initiate++;
        gravity();
        wings();
        collision();
        
       
    }    
    
   /**
    * Deze methode zorgt ervoor dat Icarus valt zolang de spatiebalk
    * niet wordt ingedrukt, door hem afhankelijk te maken van zwaartekracht.
    */
    
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
    /**
     * Deze methode laat Icarus met zijn vleugels slaan.
     */
    
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
    
    /**
     * Deze methode kijkt of Icarus met een Obstakel heeft gebotst, te hoog
     * of te laag heeft gevlogen. Als dit zo is, dan is Icarus dood en is het
     * spel voorbij.
     */
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
