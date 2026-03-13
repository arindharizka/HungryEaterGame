import greenfoot.*;

public class StartScreen extends World {
    private GreenfootSound backgroundMusic;
    public StartScreen() {    
        super(600, 400, 1);
        backgroundMusic = new GreenfootSound("backsound.mp3");
        prepare();
    }
    
    private void prepare() {
        // Tambahkan tombol play
        int buttonX = 273;
        int buttonY = (int)(getHeight() * 0.75);
        Button playButton = new Button("start.png"); // Asumsi Anda memiliki gambar dengan nama ini
        addObject(playButton, buttonX, buttonY);
        
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    @Override
    public void started() {
        backgroundMusic.playLoop(); // Memainkan musik saat StartScreen dimulai
    }
}
