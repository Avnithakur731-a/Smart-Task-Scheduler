public class Reminder {

    private int reminderId;
    private int taskId;
    private String reminderDate;
    private String reminderTime;
    private String message;


    public Reminder(int reminderId, int taskId, String reminderDate,
                    String reminderTime, String message) {

        this.reminderId = reminderId;
        this.taskId = taskId;
        this.reminderDate = reminderDate;
        this.reminderTime = reminderTime;
        this.message = message;
    }

    public Reminder(){

}

    // Reminder ID
    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public int getReminderId() {
        return reminderId;
    }

    // Task ID
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    // Reminder Date
    public void setReminderDate(String reminderDate) {
        this.reminderDate = reminderDate;
    }

    public String getReminderDate() {
        return reminderDate;
    }

    // Reminder Time
    public void setReminderTime(String reminderTime) {
        this.reminderTime = reminderTime;
    }

    public String getReminderTime() {
        return reminderTime;
    }

    // Message
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Reminder ID : " + reminderId +
               "\nTask ID : " + taskId +
               "\nDate : " + reminderDate +
               "\nTime : " + reminderTime +
               "\nMessage : " + message;
    }
}
