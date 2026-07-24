public class Notification {

    private int notificationId;
    private int taskId;
    private String message;
    private String status;


    public Notification(){

}

    public Notification(int notificationId, int taskId, String message, String status) {
        this.notificationId = notificationId;
        this.taskId = taskId;
        this.message = message;
        this.status = status;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}