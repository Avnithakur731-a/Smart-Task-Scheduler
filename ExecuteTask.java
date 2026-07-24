public class ExecuteTask {

    // Execute Task
    public void executeTask(Task task) {

        System.out.println("Executing Task...");
        System.out.println("Task ID : " + task.getTaskId());
        System.out.println("Title : " + task.getTitle());
        System.out.println("Priority : " + task.getPriority());
        System.out.println("Status : " + task.getStatus());
    }

    public void execute(int taskId){

    System.out.println("Task " + taskId + " Executed Successfully");

}

    // Mark Completed
    public void markCompleted(Task task) {

        task.setStatus("Completed");
        System.out.println("Task Completed Successfully");
    }

    // Display Executed Task
    public void displayTask(Task task) {

        System.out.println("----------------------");
        System.out.println("Task ID : " + task.getTaskId());
        System.out.println("Title : " + task.getTitle());
        System.out.println("Status : " + task.getStatus());
    }
}