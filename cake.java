import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cake extends Food
{
    /**
     * Act - do whatever the cake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        cake cake = new cake();
        getWorld().addObject(cake,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
         super.act();
        }
    }
    

