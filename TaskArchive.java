public class TaskArchive {

    public void archive(Task task) {

        if (task == null) {

            System.out.println("Task Not Found.");
            return;
        }

        task.setStatus("Archived");

        System.out.println("Task Archived Successfully.");
    }

    public void restore(Task task) {

        if (task == null) {

            System.out.println("Task Not Found.");
            return;
        }

        task.setStatus("Pending");

        System.out.println("Task Restored Successfully.");
    }
}