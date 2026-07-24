public class Task {

    private int taskId;
    private String title;
    private String description;
    private String priority;
    private String status;
    private int duedate;

    // Constructor
    public Task(int taskId, String title, String description,
                String priority, String status, int duedate) {

        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.duedate = duedate;
    }

    // taskId
    public void setTaskID(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    // title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // description
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // priority
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    // status
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    // dueDate
    public void setDuedate(int duedate) {
        this.duedate = duedate;
    }

    public int getDuedate() {
        return duedate;
    }

    // toString()
    @Override
    public String toString() {
        return "Task ID : " + taskId +
                "\nTitle : " + title +
                "\nDescription : " + description +
                "\nPriority : " + priority +
                "\nStatus : " + status +
                "\nDue Date : " + duedate;
    }

}