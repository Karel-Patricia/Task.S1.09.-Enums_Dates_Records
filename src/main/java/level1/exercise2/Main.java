package level1.exercise2;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Clean temporary files", Level.LOW);
        Task task2 = new Task("Generate monthly report", Level.HIGH);
        Task task3 = new Task("Fix production bug", Level.HIGH);

        task1.execute();
        task2.execute();
        task3.execute();

    }

}
