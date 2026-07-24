import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    // Save Tasks
    public void saveTasks(TaskService taskService) {

        try {

            FileWriter writer = new FileWriter("tasks.txt");

            for (int i = 0; i < taskService.getTaskCount(); i++) {

                Task task = taskService.getTask(i);

                writer.write(
                        task.getTaskId() + "," +
                        task.getTitle() + "," +
                        task.getDescription() + "," +
                        task.getPriority() + "," +
                        task.getStatus() + "," +
                        task.getDuedate() + "\n"
                );
            }

            writer.close();
            System.out.println("Tasks Saved Successfully");

        } catch (IOException e) {
            System.out.println("Error Saving File");
        }
    }
}