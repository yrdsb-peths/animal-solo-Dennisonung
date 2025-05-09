import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Denny 
 * @version May 9th 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("THE. elepehanttt", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 30);
        prepare();
    }

    //title screen act loop
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld myWorldgameworld = new MyWorld();
            Greenfoot.setWorld(myWorldgameworld);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,271,144);
        Label label = new Label("Use \u2190 and \u2192 to move", 30);
        addObject(label,303,253);
        label.setLocation(302,252);
        label.setLocation(302,252);
        elephant.setLocation(314,159);
        label.setLocation(372,231);
        label.setLocation(336,231);
        label.setLocation(303,231);
        Label label2 = new Label("Use space to start", 30);
        addObject(label2,300,271);
    }
}
