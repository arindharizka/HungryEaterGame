import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hammer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hammer extends NonFood
{
    /**
     * Act - do whatever the hammer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        hammer hammer = new hammer();
        getWorld().addObject(hammer,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+4);
    }
    public void act()
    {
        super.act();
    }
}
