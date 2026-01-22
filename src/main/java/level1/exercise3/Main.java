package level1.exercise3;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Go for a walk", Level.LOW);
        Task task2 = new Task("Go for a brisk walk", Level.MEDIUM);
        Task task3 = new Task("Go for a run", Level.HIGH);

        task1.execute();
        task2.execute();
        task3.execute();

    }
}
