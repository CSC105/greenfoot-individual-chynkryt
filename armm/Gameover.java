import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1191, 670, 1);  
        addObject(new Gameoverlogo(), getWidth()/2, getHeight()/2);
        addObject(new Scoreboard(),getWidth()/2,getHeight()/2+100);
        addObject(new playagain(),getWidth()/2,getHeight()/8);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
          Scoreboard score = new Scoreboard();
          score.score = 0;}
    }
}
