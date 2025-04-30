import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(900, 600, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, getWidth()/2, getHeight()/2);
        createApple();
        
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        addObject(apple, Greenfoot.getRandomNumber(getWidth()), 0);
    }
}
