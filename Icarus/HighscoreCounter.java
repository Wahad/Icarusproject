import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Deze klasse geeft een teller weer op het scherm om de score bij te houden, en 
 * na de dood van Icarus berekent hij ook de eindscore.
 * 
 */
public class HighscoreCounter extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;
    public static int Score;
    private static int BonusScore;
    public static int FinalScore;
    private static int AppelScore;
    private static int MuntScore;
    private static int VeerScore;

    /**
     * Deze constructor laat de score beginnen bij 10.
     */
    public HighscoreCounter()
    {
        background = getImage();  // get image from class
        value = 10;
        target = 10;
        updateImage();
        Score = 10;
       
    }
    
    /**
     * Deze methode laat de waardes oplopen.
     */
    public void act() 
    {
        calculateScore();
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
        if (value==0)
        {
            Greenfoot.stop();
        }
    }

    /**
     * Deze methode telt de score bij de huidge scorewaarde op.
     */
    public void add(int Score)
    {
        target += Score;
    }

    /**
     * Deze methode geeft de huidige waarde weer.
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Deze methode zorgt dat de waarde verandert als hij oplooopt.
     */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }

    /**
     * Deze methode laat de teller op het scherm oplopen zolang de waardes veranderen.
     */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage("Highscore: " + value, 22, Color.BLACK, transparent);
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
    
    /**
     * Deze methode zorgt ervoor dat de score blijft oplopen zolang Icarus leeft.
     * Als Icarus dood is worden de waardes van de verzamelde Puntenobjecten berekend en hierbij opgeteld.
     */
    
    public void calculateScore()
    {
        if(Icarus.isDead==false)
        {
            Score++;
            HighscoreCounter counter = (HighscoreCounter)getWorld().getObjects(HighscoreCounter.class).get(0);
            counter.add(1);
        }
        else
        {
            AppelScore=Icarus.Appels*100;
            MuntScore=Icarus.Munten*200;
            VeerScore=Icarus.Veren*400;
            BonusScore=AppelScore+MuntScore+VeerScore;
            FinalScore=Score+BonusScore;
        }
    }
}