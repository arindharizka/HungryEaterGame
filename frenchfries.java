import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frenchfries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frenchfries extends Food
{
    /**
     * Act - do whatever the frenchfries wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        frenchfries frenchfries = new frenchfries();
        getWorld().addObject(frenchfries,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    public void act()
    {
        super.act();
    }
}
