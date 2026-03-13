import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apar extends NonFood
{
    /**
     * Act - do whatever the apar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        apar apar = new apar();
        getWorld().addObject(apar,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
