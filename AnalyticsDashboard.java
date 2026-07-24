public class AnalyticsDashboard {

    // Total Tasks
    public void totalTasks(int total) {

        System.out.println("Total Tasks : " + total);
    }

    // Completed Tasks
    public void completedTasks(int completed) {

        System.out.println("Completed Tasks : " + completed);
    }

    // Pending Tasks
    public void pendingTasks(int pending) {

        System.out.println("Pending Tasks : " + pending);
    }

    // Display Analytics
    public void displayAnalytics(int total, int completed, int pending) {

        System.out.println("========== Analytics ==========");
        System.out.println("Total Tasks : " + total);
        System.out.println("Completed : " + completed);
        System.out.println("Pending : " + pending);
        System.out.println("===============================");
    }
}