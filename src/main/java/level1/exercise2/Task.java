package level1.exercise2;

public class Task {
    private String description;
    private Level level;

    public Task(String description, Level level) {
        this.description = description;
        this.level = level;
    }

    public void execute() {
        switch (level) {
            case LOW:
                System.out.println("Executing task with low priority: " + description);
                break;
            case MEDIUM:
                System.out.println("Executing task with medium priority: " + description);
                break;
            case HIGH:
                System.out.println("Executing task with HIGH priority: " + description);
                break;

        }
    }
}
