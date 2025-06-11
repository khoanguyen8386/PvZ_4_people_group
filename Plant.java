import greenfoot.*;  
public class Plant extends animatedObject
{
    public int maxHp;
    public boolean isAlive = true;
    public int hp;
    public int damage;
    public boolean opaque = false;
    public MyWorld MyWorld;
 
    public Plant() {}
    public void act()
    {
        if (getWorld() != null) {
            if (isLiving()) {
                update();    
                if (!opaque) {
                    getImage().setTransparency(255);
                } else {
                    getImage().setTransparency(125);
                }
            } else {
                MyWorld = (MyWorld)getWorld();
                AudioPlayer.play(80,"gulp.mp3");
                
                MyWorld.board.removePlant(getXPos(), getYPos());
                MyWorld.removeObject(this);
                
                return;
            } 
        }
    
    }
    public void update() {
        
    }
    public int getXPos() {
        return ((getX()-Board.xOffset)/Board.xSpacing);
    }   
    public int getYPos() {
        return ((getY()-Board.yOffset)/Board.ySpacing);
    }
    @Override
    public void addedToWorld(World world) {
        MyWorld = (MyWorld)getWorld();
    }
    public boolean isLiving() {
        if (hp <=0) {
            isAlive = false;
        } else {
            isAlive = true;
        }
        return isAlive;
    }
    public void hit(int dmg) {
        
    }
    
    public int sunCost = 0;

    public int getSunCost() {
        return sunCost;
    }

    public void setSunCost(int cost) {
        sunCost = cost;
    }

}
