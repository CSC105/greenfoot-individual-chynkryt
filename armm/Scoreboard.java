import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score = 0;
    public Scoreboard(){
        GreenfootImage board = new GreenfootImage("Score: "+score,45,Color.WHITE,Color.BLACK);
        setImage(board);
    }
    public void act() 
    {
        setImage(new GreenfootImage("Score: "+score,45,Color.WHITE,Color.BLACK));
    }    
}
