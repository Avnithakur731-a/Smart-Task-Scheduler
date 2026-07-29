public class TaskFilter {

    // Filter by Status
    public void filterByStatus(TaskService taskService, String status) {

        System.out.println("\n===== Tasks With Status : " + status + " =====");

        for (int i = 0; i < taskService.getTaskCount(); i++) {

            Task task = taskService.getTask(i);

            if (task.getStatus().equalsIgnoreCase(status)) {

                System.out.println("----------------------------");
                System.out.println("Task ID : " + task.getTaskId());
                System.out.println("Title : " + task.getTitle());
                System.out.println("Priority : " + task.getPriority());
                System.out.println("Status : " + task.getStatus());
                System.out.println("Due Date : " + task.getDuedate());
            }
        }
    }

    // Filter by Priority
    public void filterByPriority(TaskService taskService, String priority) {

        System.out.println("\n===== Tasks With Priority : " + priority + " =====");

        for (int i = 0; i < taskService.getTaskCount(); i++) {

            Task task = taskService.getTask(i);

            if (task.getPriority().equalsIgnoreCase(priority)) {

                System.out.println("----------------------------");
                System.out.println("Task ID : " + task.getTaskId());
                System.out.println("Title : " + task.getTitle());
                System.out.println("Priority : " + task.getPriority());
                System.out.println("Status : " + task.getStatus());
                System.out.println("Due Date : " + task.getDuedate());
            }
        }
    }
}