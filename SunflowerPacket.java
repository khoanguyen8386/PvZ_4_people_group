import greenfoot.*;  
public class SunflowerPacket extends SeedPacket
{
  
    public SunflowerPacket() {
        super(8000L, true,50, "sunflowerpacket");
    }
 
    public TransparentObject addImage() {
        TransparentObject temp = new TransparentSunflower(false);
        ((MyWorld)getWorld()).addObject(temp, Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        return temp;
    }
    public Plant getPlant() {
        return new Sunflower();
    }
}
