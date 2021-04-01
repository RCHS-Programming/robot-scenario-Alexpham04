import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rivets here.
 * 
 * @author Alex pham 
 * @version 3-30-21
 */
public class Robotworld extends World
{

    /**
     * Constructor for objects of class rivets.
     * 
     */
    public Robotworld()
    {    
        
      super(800, 600, 1); 
      addObject(new Robot(),70,70);
      addObject(new Wall(),50,150);
      addObject(new Wall(),155,150);
      addObject(new Block(),325,150);
      addObject(new Wall(),500,150);
      addObject(new Wall(),600,150);
      addObject(new Wall(),700,150);
      addObject(new Wall(),780,150); 
      addObject(new Home(),750,550);
      addObject(new Scorepanel(),80,550);
      addObject(new Pizza(),120,70);
      addObject(new Pizza(),250,200);
      addObject(new Pizza(),250,280);
      addObject(new Pizza(),375,445);
      addObject(new Pizza(),650,550);
    }
}
