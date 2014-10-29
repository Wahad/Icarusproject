import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * De vogel beweegt in een zigzagpatroon.
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
     * Bij deze methode wordt het plaatje van de vogel ook veranderd 
     * als zijn traject veranderd; d.w.z. als hij naar boven of beneden
     * vliegt.
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
