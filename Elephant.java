import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant, the hero ig, collects apples n stuff
 * 
 * @author Denny
 * @version April 30th, 2025
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 3;
    int facing = 0; // right = 0; left = 1;
    GreenfootSound elephantSound = new GreenfootSound("elephant.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    SimpleTimer deltaTimer = new SimpleTimer();
    
    public Elephant()
    {
        for(int i = 0;i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100,100);
        }
        setImage(idleRight[0]);
        for(int i = 0;i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].scale(100,100);
            idleLeft[i].mirrorHorizontally();
        }
        
        deltaTimer.mark();
        
    }
    
    int imageIndex = 0;    
    public void animateElephant()
    {
        if (deltaTimer.millisElapsed() > 250)
            {
            if(facing == 0)
            {
                setImage(idleRight[imageIndex]);
            }
            if(facing == 1)
            {
                setImage(idleLeft[imageIndex]);
            }
            imageIndex = (imageIndex + 1) % idleRight.length;
            
            deltaTimer.mark();
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            facing = 0;
            move(speed);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            facing = 1;
            move(-speed);
        }
        
        eat();
        
        animateElephant();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            elephantSound.play();
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
