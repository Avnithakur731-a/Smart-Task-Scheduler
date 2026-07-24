public class SearchService {

    // Search by ID
    public Task searchById(TaskService taskService, int id) {

        for (int i = 0; i < taskService.getTaskCount(); i++) {

            Task task = taskService.getTask(i);

            if (task.getTaskId() == id) {
                return task;
            }
        }

        return null;
    }

    // Search by Title
    public Task searchByTitle(TaskService taskService, String title) {

        for (int i = 0; i < taskService.getTaskCount(); i++) {

            Task task = taskService.getTask(i);

            if (task.getTitle().equalsIgnoreCase(title)) {
                return task;
            }
        }

        return null;
    }
}