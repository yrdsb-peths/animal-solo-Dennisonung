import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the elephant
 * 
 * @author Denny
 * @version April 30th, 2025
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 1;
    public void act()
    {
        setLocation(getX(),getY()+speed);
        MyWorld world = (MyWorld) getWorld();
        if(getY() > (world.getHeight() - 2))
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int speeeeedd)
    {
        
        speed = speeeeedd;
    }
}
