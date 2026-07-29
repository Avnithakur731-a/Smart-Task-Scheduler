public class ObserverManager {

    public void notifyUser(String message) {

        System.out.println("\n===== OBSERVER =====");
        System.out.println(message);
    }

    public void taskCreated(Task task) {

        System.out.println("Observer : Task Created -> " + task.getTitle());
    }

    public void taskDeleted(int id) {

        System.out.println("Observer : Task Deleted -> " + id);
    }

    public void taskUpdated(Task task) {

        System.out.println("Observer : Task Updated -> " + task.getTitle());
    }
}