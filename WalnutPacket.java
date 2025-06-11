import greenfoot.*;  


public class WalnutPacket extends SeedPacket
{
    
     public WalnutPacket() {
        super(40000L, false, 50, "walnutpacket");
    }
 
    public TransparentObject addImage() {
        TransparentObject temp = new TransparentWalnut(false);
        ((MyWorld)getWorld()).addObject(temp, Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        return temp;
    }
    public Plant getPlant() {
        return new Walnut();
    }
}
