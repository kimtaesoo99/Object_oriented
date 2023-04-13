package part2;

public class Alice implements Human{

    private static Alice alice;

    private int height;
    private Location location;

    public static Alice getInstance(int height, Location location) {
        if (alice == null) {
            alice = new Alice(height, location);
        }
        return alice;
    }

    private Alice(int height, Location location) {
        this.height = height;
        this.location = location;
    }

    @Override
    public void eat(Food food) {
        food.reduce();
        if (food.isPlus()){
            height += 10;
            return;
        }
        height -= 10;
    }

    public void move () {
        location = Location.GARDEN;
    }

    public int getHeight() {
        return height;
    }

    public Location getLocation() {
        return location;
    }
}

