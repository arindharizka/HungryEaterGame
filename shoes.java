import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shoes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shoes extends NonFood
{
    /**
     * Act - do whatever the shoes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        shoes shoes = new shoes();
        getWorld().addObject(shoes,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+4);
    }
    public void act()
    {
        super.act();
    }
}
