public class ActivityLogService {

    private ActivityLog[] logs = new ActivityLog[100];
    private int count = 0;

    // Add Activity
    public void addLog(ActivityLog log) {

        logs[count] = log;
        count++;

        System.out.println("Activity Saved Successfully");
    }

    // Display All Activities
    public void showLogs() {

        if(count == 0){
            System.out.println("No Activity Found");
            return;
        }

        for(int i = 0; i < count; i++){

            System.out.println("-----------------------");
            logs[i].displayLog();
        }
    }

    // Total Activities
    public int totalLogs() {

        return count;
    }
}