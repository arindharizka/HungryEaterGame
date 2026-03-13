import greenfoot.*;

public class EndScreen extends World {
    public EndScreen(int finalScore) {    
        super(600, 400, 1);
        showText("Game Over", getWidth() / 2, getHeight() / 3);
        showText("Final Score: " + finalScore, getWidth() / 2, getHeight() / 2);
        showText("Press SPACE to restart", getWidth() / 2, getHeight() * 2 / 3);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
