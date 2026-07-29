public class Dashboard {

    public void showDashboard(TaskService taskService) {

        System.out.println("\n========== DASHBOARD ==========");

        System.out.println("Total Tasks      : " + taskService.getTaskCount());
        System.out.println("Completed Tasks  : " + taskService.getCompletedTaskCount());
        System.out.println("Pending Tasks    : " + taskService.getPendingTaskCount());

        System.out.println("===============================");
    }

    public void welcome() {

        System.out.println("Welcome To Smart Task Scheduler");
    }

    public void exit() {

        System.out.println("Thank You...");
    }
}