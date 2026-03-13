import greenfoot.*;

public class Button extends Actor {
    public Button(String imageFileName) {
        setImage(imageFileName);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            // Saat tombol diklik, beralih ke MyWorld
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
