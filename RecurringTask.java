public class RecurringTask {

    private int taskId;
    private String recurrenceType;
    private int interval;

    RecurringTask(int taskId, String recurrenceType, int interval) {
        this.taskId = taskId;
        this.recurrenceType = recurrenceType;
        this.interval = interval;
    }

    // Task ID
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    // Recurrence Type
    public void setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    public String getRecurrenceType() {
        return recurrenceType;
    }

    // Interval
    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getInterval() {
        return interval;
    }

    // Display
    public void displayRecurringTask() {

        System.out.println("Task ID : " + taskId);
        System.out.println("Recurrence : " + recurrenceType);
        System.out.println("Interval : " + interval);
    }
}