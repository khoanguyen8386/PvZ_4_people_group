import greenfoot.*; 


public class fallingZombie extends animatedObject
{
   
    public GreenfootImage[] fall;
    
    
    public fallingZombie(GreenfootImage[] fall) {
        this.fall = fall;
    }
    public void act()
    {
        if (getImage().getTransparency() <= 0) {
            getWorld().removeObject(this);
            return;
        }
        if (frame <= 7) {
        
        
        animate(fall, 200, false);
        } else {
            if (getImage().getTransparency()-3 <= 0) {
                getImage().setTransparency(0);
            } else {
                getImage().setTransparency(getImage().getTransparency()-3);
            }
        }
    }
}
