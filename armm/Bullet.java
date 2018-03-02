import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    GreenfootSound sound = new GreenfootSound("hs.wav");
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Bullet(){
        GreenfootImage img = getImage();
        img.scale(20,9);
    }
    public void act() 
    {
        setLocation(getX()+2,getY());
        if(getOneObjectAtOffset(0,0,flaming.class)!=null ){
          flaming.lc --;
          getWorld().removeObject(this);
          sound.play();
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
}
