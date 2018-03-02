import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends Actor
{
    GreenfootSound sound = new GreenfootSound("ding.wav");
    /**
     * Act - do whatever the Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+2,getY());
        if(isTouching(flaming.class) ){
          flaming.lc ++;
          getWorld().removeObject(this);
          sound.play();
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
