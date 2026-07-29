public class TaskValidator {

    public boolean validate(Task task) {

        if (task == null) {

            return false;
        }

        if (task.getTitle().isEmpty()) {

            return false;
        }

        if (task.getPriority().isEmpty()) {

            return false;
        }

        return true;
    }

    public void printResult(Task task) {

        if (validate(task)) {

            System.out.println("Task is Valid.");

        } else {

            System.out.println("Invalid Task.");
        }
    }
}