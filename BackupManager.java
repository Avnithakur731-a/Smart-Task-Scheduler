public class BackupManager {

    public void createBackup(TaskService taskService) {

        System.out.println("Creating Backup...");

        System.out.println("Total Tasks : "
                + taskService.getTaskCount());

        System.out.println("Backup Completed.");
    }

    public void restoreBackup() {

        System.out.println("Backup Restored Successfully.");
    }
}