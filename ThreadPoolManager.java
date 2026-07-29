public class ThreadPoolManager {

    public void startPool() {

        System.out.println("Thread Pool Started.");
    }

    public void executeTask(Task task) {

        if (task == null) {

            System.out.println("No Task Available.");
            return;
        }

        System.out.println("Executing : " + task.getTitle());
    }

    public void stopPool() {

        System.out.println("Thread Pool Stopped.");
    }
}