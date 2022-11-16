package homework4;

public class Track implements Obstacle {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public String getType() {
        return "track";
    }

    @Override
    public int getSize() {
        return length;
    }
}
