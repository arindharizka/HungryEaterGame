import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class watermelon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class watermelon extends Food
{
    /**
     * Act - do whatever the watermelon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        watermelon watermelon = new watermelon();
        getWorld().addObject(watermelon,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+1);
    }
    public void act()
    {
        super.act();
    }
}
