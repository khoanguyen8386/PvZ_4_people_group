import greenfoot.*;
public class Board extends Actor
{
    public Plant[][] Board = new Plant[5][9]; 
    public static final int xOffset = 212;
    public static final int yOffset = 95;
    public static final int xSpacing = 60;
    public static final int ySpacing = 72;
    public Board()
    {
        
    }
    public void placePlant(int x, int y, Plant plant) {
        if (Board[y][x] == null) {
            Board[y][x] = plant; 
            World MyWorld = getWorld();

            if (MyWorld instanceof MyWorld) {
                SeedPacket selected = ((MyWorld)MyWorld).seedbank.selectedPacket;
                if (selected != null) {
                    plant.setSunCost(selected.sunCost);
                }
            }
            
            MyWorld.addObject(plant, x*xSpacing+xOffset, y*ySpacing+yOffset);
            AudioPlayer.play(80, "plant.mp3", "plant2.mp3");
        }
        
    }
    public Plant getPlant(int x, int y) {
        return Board[y][x];
    }
    public void removePlant(int x, int y) {
        Plant plant = Board[y][x];

        if (plant != null) {
            int refundAmount = plant.getSunCost() / 2;
            World world = getWorld();

            if (refundAmount > 0 && world instanceof MyWorld) {
                Sun refundSun = new Sun(refundAmount);
                world.addObject(refundSun, plant.getX(), plant.getY());
            }
            world.removeObject(plant);
            Board[y][x] = null;
        }
        AudioPlayer.play(80,"plant2.mp3");
    }
    
    public void updateBoard() {
        for (int i = 0; i < Board.length; i++) {
            for (int k = 0; k < Board[0].length; k++) {
                if (Board[i][k] != null) {
                    World MyWorld = getWorld();
                    Plant temp = Board[i][k];
                    MyWorld.addObject(temp, k*xSpacing+xOffset, i*ySpacing+yOffset);
                }
            }
        }
        
    }
    public void act()
    {
        
    }
}
