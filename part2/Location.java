package part2;

public enum Location {

    CAVE("굴"){},
    GARDEN("정원");

    private String name;

    Location(String name) {
        this.name = name;
    }

    public static String getName(Location location) {
        return location.name;
    }
}
