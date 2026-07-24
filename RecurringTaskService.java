public class RecurringTaskService {

    private RecurringTask[] recurringTasks = new RecurringTask[100];
    private int count = 0;

    // Add Recurring Task
    public void addRecurringTask(RecurringTask task) {

        recurringTasks[count] = task;
        count++;

        System.out.println("Recurring Task Added Successfully");
    }

    // Display All Recurring Tasks
    public void showRecurringTasks() {

        if(count == 0){
            System.out.println("No Recurring Tasks Found");
            return;
        }

        for(int i = 0; i < count; i++){

            System.out.println("----------------------------");
            recurringTasks[i].displayRecurringTask();
        }
    }

    // Total Recurring Tasks
    public int totalRecurringTasks() {

        return count;
    }

    // Remove All Recurring Tasks
    public void clearRecurringTasks() {

        count = 0;
        System.out.println("All Recurring Tasks Removed");
    }
}