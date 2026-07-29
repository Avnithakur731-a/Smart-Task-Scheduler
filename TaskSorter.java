public class TaskSorter {

    // Sort By Due Date (Ascending)
    public void sortByDueDate(TaskService taskService) {

        for (int i = 0; i < taskService.getTaskCount() - 1; i++) {

            for (int j = i + 1; j < taskService.getTaskCount(); j++) {

                Task t1 = taskService.getTask(i);
                Task t2 = taskService.getTask(j);

                if (t1.getDuedate() > t2.getDuedate()) {

                    taskService.setTask(i, t2);
                    taskService.setTask(j, t1);
                }
            }
        }

        System.out.println("Tasks Sorted By Due Date.");
    }

    // Sort By Title (A-Z)
    public void sortByTitle(TaskService taskService) {

        for (int i = 0; i < taskService.getTaskCount() - 1; i++) {

            for (int j = i + 1; j < taskService.getTaskCount(); j++) {

                Task t1 = taskService.getTask(i);
                Task t2 = taskService.getTask(j);

                if (t1.getTitle().compareToIgnoreCase(t2.getTitle()) > 0) {

                    taskService.setTask(i, t2);
                    taskService.setTask(j, t1);
                }
            }
        }

        System.out.println("Tasks Sorted By Title.");
    }

    // Display Sorted Tasks
    public void display(TaskService taskService) {

        taskService.displayTasks();
    }
}