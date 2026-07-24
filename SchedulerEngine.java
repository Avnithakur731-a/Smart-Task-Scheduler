import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class SchedulerEngine {


    private ScheduledExecutorService scheduler;
    private ArrayList<Task> scheduledTasks;



    // Constructor
    public SchedulerEngine(){

        scheduler = Executors.newScheduledThreadPool(1);
        scheduledTasks = new ArrayList<>();

    }



    // Add task to scheduler
    public void addTask(Task task){

        scheduledTasks.add(task);

        System.out.println(
            "Task scheduled: " + task.getTitle()
        );

    }



    // Start scheduler
    public void startScheduler(){


        scheduler.scheduleAtFixedRate(

            new Runnable(){

                @Override
                public void run(){

                    checkTasks();

                }

            },

            0,
            10,
            TimeUnit.SECONDS

        );


        System.out.println(
            "Scheduler started..."
        );

    }



    // Check pending tasks
    private void checkTasks(){


        for(Task task : scheduledTasks){


            System.out.println(
                "Checking task: "
                + task.getTitle()
            );


            // Future me due date comparison add hoga


        }

    }




    // Stop scheduler
    public void stopScheduler(){


        scheduler.shutdown();


        System.out.println(
            "Scheduler stopped"
        );

    }



    // Get scheduled task count
    public int getScheduledTaskCount(){

        return scheduledTasks.size();

    }


}