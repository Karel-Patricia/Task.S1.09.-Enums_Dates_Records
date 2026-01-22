package level1.exercise3;

public class Task {
    private String description;
    private Level level;

    public Task(String description, Level level) {
        this.description = description;
        this.level = level;
    }

    public void execute() {
        System.out.println(
                "Task: " + description +
                        " | Level: " + level +
                        " | Color: " + level.getColor()
        );
    }
}
