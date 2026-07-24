public class TaskHistory {

    private int historyId;
    private int taskId;
    private String action;
    private String date;

    public TaskHistory(int historyId, int taskId, String action, String date) {
        this.historyId = historyId;
        this.taskId = taskId;
        this.action = action;
        this.date = date;
    }

    // History ID
    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public int getHistoryId() {
        return historyId;
    }

    // Task ID
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    // Action
    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    // Date
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "History ID : " + historyId +
               "\nTask ID : " + taskId +
               "\nAction : " + action +
               "\nDate : " + date;
    }
}