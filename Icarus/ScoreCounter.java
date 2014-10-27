import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{   
    public static int Score;
    private static int BonusScore;
    public static int FinalScore;
    private static int AppelScore;
    private static int MuntScore;
    private static int VeerScore;
    /**
     * Act - do whatever the ScoreCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ScoreCounter()
    {
        Score=10;
    }
    public void act() 
    {
        calculateScore();
    }    
    
    
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
            VeerScore=Icarus.Veren*500;
            BonusScore=AppelScore+MuntScore+VeerScore;
            FinalScore=Score+BonusScore;
        }
    }
    
}
