import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    flaming flamingo = new flaming();
    
    int timer = 300;
    public MyWorld()
    {    
      
        super(1191, 670, 1); 
        //((flaming)flamingo).lc = 5;
        addObject(flamingo, getWidth()/2, getHeight()/2);
        //addObject(new Bullet(), 0, getHeight()/2);
        heart(900,25, flaming.lc );
        addObject(new Scoreboard(),100,20);
        //addObject(new LifeCount(), 1060,20);
    }
    
    public void act(){
        timer--;
        if(Greenfoot.getRandomNumber(25) == 2){
            addObject(new Bullet(),0,Greenfoot.getRandomNumber(670));
        }
        if(timer== 0){
            addObject(new Item(),0,Greenfoot.getRandomNumber(670));
            timer=600;
        }
        updateHeart(900,25,flaming.lc) ;
        Scoreboard.score++;
        //heart(900,25, ((flaming)flamingo).lc );
    }
    
    public void heart(int x,int y, int num){
        for(int i= 0; i<num ; i++){
        addObject(new Life(),x,y);
        x=x+50;
       }
    }
    
    public void updateHeart(int x,int y,int num){
       removeObjects(this.getObjects(Life.class));
       for(int i= 0; i<num ; i++){
                 addObject(new Life(),x,y);
                 x=x+50;
        }
        
    
    }
        
}
