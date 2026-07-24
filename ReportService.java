public class ReportService {

    // Total Tasks Report
    public void totalTasks(int taskCount) {
        System.out.println("Total Tasks : " + taskCount);
    }

    // Completed Tasks Report
    public void completedTasks(int completed) {
        System.out.println("Completed Tasks : " + completed);
    }

    // Pending Tasks Report
    public void pendingTasks(int pending) {
        System.out.println("Pending Tasks : " + pending);
    }

    // Display Summary
    public void generateReport(int total, int completed, int pending) {

        System.out.println("========== TASK REPORT ==========");
        System.out.println("Total Tasks      : " + total);
        System.out.println("Completed Tasks  : " + completed);
        System.out.println("Pending Tasks    : " + pending);
        System.out.println("=================================");
    }
}