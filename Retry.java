import greenfoot.*;  
public class Retry extends Button
{
    
    public World restart;
    public Retry(World restart) {
        super("retry1.png", "retry2.png");
        this.restart = restart;
    }
    public void update() {
        getWorld().addObject(new Transition(false, restart, 10), 365, 215);
    }
}
