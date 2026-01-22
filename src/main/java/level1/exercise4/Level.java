package level1.exercise4;

public enum Level {
    LOW("Yellow"),
    MEDIUM("Blue"),
    HIGH("Green");

    private final String color;

    Level(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
