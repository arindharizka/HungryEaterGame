import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NonFood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class NonFood extends Actor {
    public void act() {
        setLocation(getX(), getY() + 3); // Misalkan kecepatan jatuh NonFood lebih cepat
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
}
