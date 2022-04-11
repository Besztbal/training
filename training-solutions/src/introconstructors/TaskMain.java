package introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task task=new Task("hozz", "tejet");

        task.setDuration(30);

        task.start();

        System.out.println(task);
    }
}
