import greenfoot.*;  


public class SunCounter extends Actor
{
    public static final int x = 120;
    public static final int y = 50;
    public int sun = 50;
    public static final int textY = 45;
    public long currentFrame = System.nanoTime();
    public long lastFrame = System.nanoTime();
    public long deltaTime;    
  
    MyWorld MyWorld;
    
    public void act()
    {
        currentFrame = System.nanoTime();
        deltaTime = (currentFrame - lastFrame) / 1000000;
        if (deltaTime >= 10000L) {
            MyWorld.addObject(new FallingSun(), Random.Int(SeedBank.x1, SeedBank.x2), 0);
            lastFrame = System.nanoTime();
        }
        
      
    }
    
    public void addedToWorld(World world) {
        MyWorld = (MyWorld)getWorld();
        currentFrame = System.nanoTime();
        lastFrame = System.nanoTime();
        updateText();
    }
    public void updateText() {
        String number = ""+sun;
        char[] text = number.toCharArray();
        getImage().clear();
        setImage("suncounter.png");
        for (int i = 0; i < text.length; i++) {
            if (text.length > 5) {
                sun = 99999;
                System.out.println("hacker");
            } else if (text.length > 4) {
                getImage().drawImage(new GreenfootImage("text"+text[i]+".png"), 20+i*12,textY);
            } else if (text.length > 3) {
                getImage().drawImage(new GreenfootImage("text"+text[i]+".png"), 26+i*12,textY);
            }else if (text.length > 2) {
                getImage().drawImage(new GreenfootImage("text"+text[i]+".png"), 33+i*12,textY);
            }else if (text.length > 1) {
                
                getImage().drawImage(new GreenfootImage("text"+text[i]+".png"), 38+i*12,textY);
            }else if (text.length == 1) {
                
                getImage().drawImage(new GreenfootImage("text"+text[i]+".png"), 44,textY);
            } else {
                
                
             
            }
        }
    }
    public void addSun(int sun) {
        this.sun += sun;
        updateText();
    }
    public void removeSun(int sun) {
        this.sun -= sun;
        updateText();
    }
    public void spawnRefundSun(int x, int y, int value) {
        Sun refundSun = new Sun(value);
        refundSun.setLocation(x, y);
        MyWorld.addObject(refundSun, x, y);
    }

}
