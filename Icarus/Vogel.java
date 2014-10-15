import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vogel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vogel extends Obstakel
{
    public GreenfootImage image1;
    public GreenfootImage image2;
    
    public Vogel()
    {
        image1 = new GreenfootImage("VogelSprite1.png");
        image2 = new GreenfootImage("VogelSprite2.png");
        turn(55);
        setImage(image2);
    }
    /**
     * Act - do whatever the Vogel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-speed);
        if(getY()>=300)
        {
            turn(55);
            move(-5);
            setImage(image2);
        }
        else if(getY()<=200)
        {
            turn(-55);
            move(-5);
            setImage(image1);
        } 
        DeleteAfterUse();
    }    
}
