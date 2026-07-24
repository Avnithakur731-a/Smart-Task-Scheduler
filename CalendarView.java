import java.time.LocalDate;
import java.util.ArrayList;


public class CalendarView {

    private ArrayList<Task> tasks;


    // Constructor
    public CalendarView(ArrayList<Task> tasks){
        this.tasks = tasks;
    }


    // Show today's tasks
    public void showTodayTasks(){

        LocalDate today = LocalDate.now();

        System.out.println("\n===== TODAY TASKS =====");

        boolean found = false;

        for(Task task : tasks){

            if(task.getDueDate().equals(today.toString())){

                System.out.println(
                    "Task : " + task.getTitle()
                );

                found = true;
            }
        }


        if(!found){
            System.out.println("No tasks for today");
        }

    }



    // Show tasks by specific date
    public void showTasksByDate(String date){

        System.out.println("\n===== TASKS ON " + date + " =====");


        boolean found = false;


        for(Task task : tasks){

            if(task.getDueDate().equals(date)){

                System.out.println(
                    "Task : " + task.getTitle()
                );

                found = true;
            }

        }


        if(!found){
            System.out.println("No tasks found");
        }

    }



    // Monthly calendar view
    public void showMonthView(String month){

        System.out.println("\n===== MONTH VIEW : " + month + " =====");


        for(Task task : tasks){

            if(task.getDueDate().startsWith(month)){

                System.out.println(
                    task.getDueDate()
                    + " -> "
                    + task.getTitle()
                );

            }

        }

    }


}