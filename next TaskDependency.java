public class TaskDependency {

    private int taskId;
    private int dependsOnTaskId;

    TaskDependency(int taskId, int dependsOnTaskId) {
        this.taskId = taskId;
        this.dependsOnTaskId = dependsOnTaskId;
    }

    // Task ID
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    // Dependency Task ID
    public void setDependsOnTaskId(int dependsOnTaskId) {
        this.dependsOnTaskId = dependsOnTaskId;
    }

    public int getDependsOnTaskId() {
        return dependsOnTaskId;
    }

    // Display Dependency
    public void displayDependency() {

        System.out.println("Task ID : " + taskId);
        System.out.println("Depends On Task ID : " + dependsOnTaskId);
    }
}