import greenfoot.*;  
public class TransparentRepeater extends TransparentObject
{
   
    public TransparentRepeater(boolean bool) {
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
