public class TaskService {

    private Task[] tasks = new Task[100];
    private int taskCount = 0;

    // Add Task
    public void addTask(Task task) {

        tasks[taskCount] = task;
        taskCount++;

        System.out.println("Task Added Successfully");
    }

    // Display Tasks
    public void displayTasks() {

        if (taskCount == 0) {
            System.out.println("No Tasks Found");
            return;
        }

        for (int i = 0; i < taskCount; i++) {

            System.out.println("----------------------");
            System.out.println("Task ID : " + tasks[i].getTaskId());
            System.out.println("Title : " + tasks[i].getTitle());
            System.out.println("Description : " + tasks[i].getDescription());
            System.out.println("Priority : " + tasks[i].getPriority());
            System.out.println("Status : " + tasks[i].getStatus());
            System.out.println("Due Date : " + tasks[i].getDuedate());
        }
    }

    // Edit Task
    public boolean editTask(int id, String title, String description,
                            String priority, String status, int dueDate) {

        for (int i = 0; i < taskCount; i++) {

            if (tasks[i].getTaskId() == id) {

                tasks[i].setTitle(title);
                tasks[i].setDescription(description);
                tasks[i].setPriority(priority);
                tasks[i].setStatus(status);
                tasks[i].setDuedate(dueDate);

                return true;
            }
        }

        return false;
    }

    // Delete Task
    public boolean deleteTask(int id) {

        for (int i = 0; i < taskCount; i++) {

            if (tasks[i].getTaskId() == id) {

                for (int j = i; j < taskCount - 1; j++) {
                    tasks[j] = tasks[j + 1];
                }

                tasks[taskCount - 1] = null;
                taskCount--;

                return true;
            }
        }

        return false;
    }

    // Total Tasks
    public int getTaskCount() {
        return taskCount;
    }

    // Get Task
    public Task getTask(int index) {
        return tasks[index];
    }
}