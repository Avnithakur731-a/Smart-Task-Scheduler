public class TaskStatistics {

    public void showStatistics(TaskService taskService) {

        int total = taskService.getTaskCount();
        int completed = taskService.getCompletedTaskCount();
        int pending = taskService.getPendingTaskCount();

        System.out.println("\n========== TASK STATISTICS ==========");
        System.out.println("Total Tasks      : " + total);
        System.out.println("Completed Tasks  : " + completed);
        System.out.println("Pending Tasks    : " + pending);
    }

    public double completionPercentage(TaskService taskService) {

        int total = taskService.getTaskCount();
        int completed = taskService.getCompletedTaskCount();

        if (total == 0) {
            return 0;
        }

        return (completed * 100.0) / total;
    }

    public void showCompletionPercentage(TaskService taskService) {

        System.out.printf("Completion : %.2f%%\n",
                completionPercentage(taskService));
    }
}