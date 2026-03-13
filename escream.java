import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class escream here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class escream extends Food
{
    /**
     * Act - do whatever the escream wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        escream escream = new escream();
        getWorld().addObject(escream,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
