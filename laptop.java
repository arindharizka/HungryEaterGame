import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laptop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laptop extends NonFood
{
    /**
     * Act - do whatever the laptop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     void cetakbaru(){
        laptop laptop = new laptop();
        getWorld().addObject(laptop,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+3);
    }
    public void act()
    {
        super.act();
    }
}
