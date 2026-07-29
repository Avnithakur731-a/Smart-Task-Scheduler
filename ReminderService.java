public class ReminderService {

    private NotificationService notificationService =
            new NotificationService();

    // Check Single Task Reminder
    public void checkReminder(Task task) {

        if (task == null) {
            return;
        }

        notificationService.reminder(task);
    }

    // Check All Tasks
    public void checkAllReminders(TaskService taskService) {

        System.out.println("\n========== REMINDERS ==========");

        if (taskService.getTaskCount() == 0) {

            System.out.println("No Tasks Available.");
            return;
        }

        for (int i = 0; i < taskService.getTaskCount(); i++) {

            Task task = taskService.getTask(i);

            notificationService.reminder(task);
        }
    }

    // Manual Reminder
    public void sendCustomReminder(String message) {

        notificationService.sendNotification(message);
    }
}