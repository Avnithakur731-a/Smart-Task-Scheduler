public class NotificationService {

    // Send Notification
    public void sendNotification(String message) {

        System.out.println("\n========== NOTIFICATION ==========");
        System.out.println(message);
    }

    // Task Created
    public void taskCreated(Task task) {

        System.out.println("\n[Notification]");
        System.out.println("Task Created Successfully.");
        System.out.println("Task : " + task.getTitle());
    }

    // Task Deleted
    public void taskDeleted(int taskId) {

        System.out.println("\n[Notification]");
        System.out.println("Task Deleted Successfully.");
        System.out.println("Task ID : " + taskId);
    }

    // Task Updated
    public void taskUpdated(Task task) {

        System.out.println("\n[Notification]");
        System.out.println("Task Updated Successfully.");
        System.out.println("Task : " + task.getTitle());
    }

    // Reminder Notification
    public void reminder(Task task) {

        System.out.println("\n[Reminder]");
        System.out.println("Task : " + task.getTitle());
        System.out.println("Due Date : " + task.getDuedate());
        System.out.println("Complete it before deadline.");
    }
}