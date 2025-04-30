import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant, the hero
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
    
    private int speed = 1;
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(speed);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            move(-speed);
        }
        
        eat();
        
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
        }
    }
}
