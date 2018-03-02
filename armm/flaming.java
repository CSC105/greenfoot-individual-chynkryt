import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flaming here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flaming extends Actor
{
    /**
     * Act - do whatever the flaming wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     GreenfootImage[] images = new GreenfootImage[36];
     GreenfootImage[] imagesLeft = new GreenfootImage[36];
   int imageNumber;
   //World myWorld  = getWorld();
   public static int lc = 0;
    public flaming(){
        for( int i=0; i<images.length; i++ ) {
        images[i] = new GreenfootImage( "Flamingo" + (i+1) + ".png" );
        imagesLeft[i] = new GreenfootImage("Flamingo" + (i+1) + ".png");
        imagesLeft[i].mirrorHorizontally();
        images[i].scale(90,145);
        imagesLeft[i].scale(90,145);
        setImage( images[imageNumber] );
        
    }
    lc = 5 ;
   }
    public void act() 
    {
          Touching();
          key();
          
        }
        
       public void key(){
        if(Greenfoot.isKeyDown("left")){
            AnimationLeft();
            //getImage().mirrorHorizontally();
            setLocation(getX()-3,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            Animation();
            setLocation(getX()+3,getY());
            
        }
         if(Greenfoot.isKeyDown("up")){
                turn(3);
                setLocation(getX(),getY()-3);
            }
            if(Greenfoot.isKeyDown("down")){
                turn(-3);
                setLocation(getX(),getY()+3);
            }
        
        }   
        
   public void Animation(){
        imageNumber = ( imageNumber + 1 ) % images.length;
        setImage( images[imageNumber] );
     }
     public void AnimationLeft(){
         imageNumber = ( imageNumber + 1 ) % images.length;
        setImage( imagesLeft[imageNumber] );
        }
        
     public void Touching(){    
         //if(this.isTouching(Bullet.class)){
           // this.lc--;
      //  }
        if(lc<0 || lc==0){
            Greenfoot.setWorld(new Gameover());
        }
    }  
}
    
    


