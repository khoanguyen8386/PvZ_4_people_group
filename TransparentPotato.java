import greenfoot.*;  
public class TransparentPotato extends TransparentObject
{
   
    public TransparentPotato(boolean bool) {
        if (bool) {
            getImage().setTransparency(125);
        } else {
            getImage().setTransparency(255);
        }
    }
    public void act()
    {
       
    }
}
