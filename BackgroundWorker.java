public class BackgroundWorker {

    public void startWorker() {

        System.out.println("Background Worker Started...");
    }

    public void execute(Task task) {

        if (task == null) {

            System.out.println("No Task To Execute.");
            return;
        }

        System.out.println("Executing : " + task.getTitle());
        System.out.println("Status : " + task.getStatus());
    }

    public void stopWorker() {

        System.out.println("Background Worker Stopped.");
    }
}
