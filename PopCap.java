import greenfoot.*;  
public class PopCap extends World
{
    public int counter = 0;
    public GreenfootSound menutheme = new GreenfootSound("menutheme.mp3");
    public PopCap()
    {    
        super(576, 430, 1, false); 
        setPaintOrder(EndTransition.class, Transition.class);
    }
    public void act() {
        if (!menutheme.isPlaying()) {
            menutheme.setVolume(70);
            menutheme.playLoop();
        }
        counter++;
        if (counter > 100) {
            addObject(new Transition(true, new MainMenu(menutheme), 6), 288, 215);
        }
    }
}
