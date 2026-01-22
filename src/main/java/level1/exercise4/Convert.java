package level1.exercise4;

public class Convert {

    public static void convertAndPrintLevel(String value) {
        try {
            Level level = Level.valueOf(value);
            System.out.println(
                    "Converted level: " + level +
                            " | Color: " + level.getColor()
            );
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Error: '" + value + "' is not a valid Level"
            );
        }
    }
}
