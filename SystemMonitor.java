public class SystemMonitor {

    public void showSystemStatus() {

        System.out.println("\n===== SYSTEM STATUS =====");

        System.out.println("Memory Used : "
                + Runtime.getRuntime().totalMemory());

        System.out.println("Free Memory : "
                + Runtime.getRuntime().freeMemory());

        System.out.println("Available Processors : "
                + Runtime.getRuntime().availableProcessors());
    }

    public void checkHealth() {

        System.out.println("System Running Successfully.");
    }
}