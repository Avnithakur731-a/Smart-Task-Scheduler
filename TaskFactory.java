public class TaskFactory {

    public Task createTask(int id,
                           String title,
                           String description,
                           String priority,
                           String status,
                           int dueDate) {

        return new Task(
                id,
                title,
                description,
                priority,
                status,
                dueDate
        );
    }

    public Task defaultTask() {

        return new Task(
                0,
                "New Task",
                "No Description",
                "Low",
                "Pending",
                0
        );
    }
}