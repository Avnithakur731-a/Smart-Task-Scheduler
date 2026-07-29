public class ScheduleOptimizer {

    public void optimize(TaskService taskService) {

        System.out.println("\n===== Schedule Optimizer =====");

        if (taskService.getTaskCount() == 0) {

            System.out.println("No Tasks Available.");
            return;
        }

        for (int i = 0; i < taskService.getTaskCount(); i++) {

            Task task = taskService.getTask(i);

            if (task.getPriority().equalsIgnoreCase("High")) {

                System.out.println("Execute First : " + task.getTitle());
            }
        }

        System.out.println("Schedule Optimized Successfully.");
    }
}