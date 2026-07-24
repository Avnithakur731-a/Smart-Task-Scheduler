public class PriorityManager {

    // Display Priority
    public void showPriority(Task task) {

        System.out.println("Task : " + task.getTitle());
        System.out.println("Priority : " + task.getPriority());
    }

    // Check High Priority
    public boolean isHighPriority(Task task) {

        return task.getPriority().equalsIgnoreCase("High");
    }

    // Check Medium Priority
    public boolean isMediumPriority(Task task) {

        return task.getPriority().equalsIgnoreCase("Medium");
    }

    // Check Low Priority
    public boolean isLowPriority(Task task) {

        return task.getPriority().equalsIgnoreCase("Low");
    }
}