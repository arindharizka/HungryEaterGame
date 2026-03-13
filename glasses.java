import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class glasses here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class glasses extends NonFood
{
    /**
     * Act - do whatever the glasses wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        glasses glasses = new glasses();
        getWorld().addObject(glasses,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+1);
    }
    public void act()
    {
        super.act();
    }
}
