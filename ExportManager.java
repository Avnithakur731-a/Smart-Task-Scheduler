import java.io.FileWriter;
import java.io.IOException;

public class ExportManager {

    public void exportTasks(TaskService taskService) {

        try {

            FileWriter writer = new FileWriter("TaskReport.txt");

            writer.write("========== TASK REPORT ==========\n\n");

            for (int i = 0; i < taskService.getTaskCount(); i++) {

                Task task = taskService.getTask(i);

                writer.write("Task ID : " + task.getTaskId() + "\n");
                writer.write("Title : " + task.getTitle() + "\n");
                writer.write("Description : " + task.getDescription() + "\n");
                writer.write("Priority : " + task.getPriority() + "\n");
                writer.write("Status : " + task.getStatus() + "\n");
                writer.write("Due Date : " + task.getDuedate() + "\n");
                writer.write("---------------------------------\n");
            }

            writer.close();

            System.out.println("Tasks Exported Successfully.");
            System.out.println("File Name : TaskReport.txt");

        } catch (IOException e) {

            System.out.println("Error While Exporting Tasks.");
        }
    }
}