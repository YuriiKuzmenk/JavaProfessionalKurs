package homework4;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public String getType() {
        return "wall";
    }

    @Override
    public int getSize() {
        return height;
    }
}
