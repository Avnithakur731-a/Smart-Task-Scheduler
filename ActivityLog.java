public class ActivityLog {

    private String activity;
    private String date;
    private String time;

    ActivityLog(String activity, String date, String time) {
        this.activity = activity;
        this.date = date;
        this.time = time;
    }

    // Activity
    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    // Date
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    // Time
    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    // Display
    public void displayLog() {
        System.out.println("Activity : " + activity);
        System.out.println("Date : " + date);
        System.out.println("Time : " + time);
    }
}