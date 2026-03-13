import greenfoot.*;

public class ScoreBoard extends Actor {
    private int score = 0;
    private int lives = 3;

    public ScoreBoard() {
        update();
    }

    public void addScore(int points) {
        score += points;
        update();
    }

    public void loseLife() {
        lives--;
        update();
    }

    private void update() {
        setImage(new GreenfootImage("Score: " + score + " Lives: " + lives, 24, Color.WHITE, Color.BLACK));
    }
    public int getLives() {
        return lives;
    }

    public int getScore() {
        return score;
    }

}
