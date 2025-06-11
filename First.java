import greenfoot.*;  
public class First extends World
{

    public First()
    {    
   
        super(576, 430, 1, false); 
        setBackground(new GreenfootImage("transition.png"));
        addObject(new Transition(true, new PopCap(),10),288, 215);
        setPaintOrder(EndTransition.class, Transition.class);
    }
    public void act() {
        
    }
}
