import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spaghetti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spaghetti extends Food
{
    /**
     * Act - do whatever the spaghetti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        spaghetti spaghetti = new spaghetti();
        getWorld().addObject(spaghetti,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+4);
    }
    public void act()
    {
        super.act();
    }
}
