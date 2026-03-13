import greenfoot.*; 

public class Human extends Actor {
    public void act() {
        if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
        checkCollision();
    }
    
    private void checkCollision() {
        if (isTouching(Food.class)) {
            Greenfoot.playSound("makan.mp3");
            removeTouching(Food.class);
            ((MyWorld)getWorld()).updateScore(10); // Update skor
        } else if (isTouching(NonFood.class)) {
            Greenfoot.playSound("tertimpa.wav");
            removeTouching(NonFood.class);
            ((MyWorld)getWorld()).loseLife(); // Kurangi nyawa
        }
    }
}
