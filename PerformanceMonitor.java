public class PerformanceMonitor {

    private long startTime;
    private long endTime;

    public void start() {

        startTime = System.currentTimeMillis();

        System.out.println("Performance Monitoring Started.");
    }

    public void stop() {

        endTime = System.currentTimeMillis();

        System.out.println("Performance Monitoring Stopped.");
    }

    public void showExecutionTime() {

        System.out.println("Execution Time : "
                + (endTime - startTime) + " ms");
    }
}