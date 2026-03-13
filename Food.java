import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Food extends Actor {
    public void act() {
        setLocation(getX(), getY() + 2); // Misalkan kecepatan jatuh makanan
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
}
