import greenfoot.*;  
public class Walnut extends Plant
{
 
    private GreenfootImage[] idle;
    private GreenfootImage[] d;
    private GreenfootImage[] dd;
    private boolean test = false;
    private long lastFrame2 = System.nanoTime();
    private long deltaTime2;
    public Walnut() {
        idle = importSprites("walnut", 4);
        d = importSprites("walnutd", 4);
        dd = importSprites("walnutdd", 4);
        maxHp = 730;
        hp = maxHp;
    }
    
    public void update(){
        if (hp >= 480) {
            animate(idle, 200, true);
        } else if (hp >= 240) {
            animate(d, 200, true);
        } else {
            animate(dd, 200, true);
        }

    }
    public void hit(int dmg) {
        if (isLiving()) {
            if (hp >= 480) {
                hitFlash(idle, "walnut");
            } else if (hp >= 240) {
                hitFlash(d, "walnutd");
            } else {
                hitFlash(dd, "walnutdd");
            }
            
            
            hp = hp-dmg;
        }
    }
  
}
