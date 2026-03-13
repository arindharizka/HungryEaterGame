import greenfoot.*; // Import Greenfoot API

public class MyWorld extends World {
    private int score = 0;
    private int lives = 3; // Misalkan pemain memulai dengan 3 nyawa
    private Human human;
    private int level = 1;
    private ScoreBoard ScoreBoard;
    private boolean transitioningToNextLevel = false;
    
    public MyWorld() {    
        super(600, 400, 1);
        ScoreBoard = new ScoreBoard();
        addObject(ScoreBoard, 91, 25);
        human = new Human();
        addObject(human, 300, 350);
        prepareLevel(level);
    }
    
    public void act() {
        // Menyesuaikan probabilitas spawn berdasarkan level
        int spawnChance = level == 1 ? 2 : 3; // Chance untuk spawn lebih tinggi di level 2
        if (Greenfoot.getRandomNumber(100) < spawnChance) {
            if (Greenfoot.getRandomNumber(2) == 0) {
                addRandomFood(); // Menambahkan Food secara acak
            } else {
                addRandomNonFood(); // Menambahkan NonFood secara acak
            }
        }
        
        // Contoh peningkatan level, bisa diadaptasi sesuai kebutuhan
        if (score >= 100 && level == 1 && !transitioningToNextLevel) {
            level = 2;
            showText("Level Up! Proceeding to Level 2...", getWidth() / 2, getHeight() / 2);
            Greenfoot.delay(500); // Delay untuk memberikan waktu pada pemain membaca pesan
            prepareLevel(level);
            showText("", getWidth() / 2, getHeight() / 2); // Menghilangkan teks
            transitioningToNextLevel = true;
        }
    }
    
    private void prepareLevel(int level) {
        // Adjust game parameters based on level
        if (level == 2) {
            // Increase speed, frequency, etc.
            // This could include making Food and NonFood fall faster or spawn more frequently.
        }
    }
    
    private void addRandomFood() {
        int x = Greenfoot.getRandomNumber(getWidth());
        Food[] foods = {new cake(), new escream(), new frenchfries(), new spaghetti(), new watermelon()};
        int idx = Greenfoot.getRandomNumber(foods.length);
        addObject(foods[idx], x, 0);
    }

    private void addRandomNonFood() {
        int x = Greenfoot.getRandomNumber(getWidth());
        NonFood[] nonFoods = {new apar(), new glasses(), new hammer(), new laptop(), new shoes()};
        int idx = Greenfoot.getRandomNumber(nonFoods.length);
        addObject(nonFoods[idx], x, 0);
    }
    
    public void updateScore(int points) {
        score += points;
        ScoreBoard.addScore(points); // Update skor pada ScoreBoard
        // Check untuk peningkatan level
        if (score >= 100 && level == 1 && !transitioningToNextLevel) {
            level = 2;
            transitioningToNextLevel = true; // Tandai bahwa kita sedang transisi ke level berikutnya
            showText("Level Up! Proceeding to Level 2...", getWidth() / 2, getHeight() / 2);
            Greenfoot.delay(500); // Delay untuk memberikan waktu pada pemain membaca pesan
            prepareLevel(level);
            showText("", getWidth() / 2, getHeight() / 2);
        }
    }
    
        
    public void loseLife() {
        ScoreBoard.loseLife();
        // Anda mungkin juga ingin menambahkan logika untuk mengakhiri game
        // jika nyawa habis, misalnya memanggil method gameOver()
        if(ScoreBoard.getLives() <= 0) {
            Greenfoot.setWorld(new EndScreen(ScoreBoard.getScore()));
        }
    }
}
