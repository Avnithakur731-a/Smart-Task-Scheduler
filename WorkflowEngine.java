public class WorkflowEngine {

    public void startWorkflow() {
        System.out.println("Workflow Started...");
    }

    public void executeTask(Task task) {

        System.out.println("Executing Task...");
        System.out.println("Task ID : " + task.getTaskId());
        System.out.println("Title : " + task.getTitle());
        System.out.println("Status : " + task.getStatus());
    }

    public void completeWorkflow() {
        System.out.println("Workflow Completed.");
    }
}