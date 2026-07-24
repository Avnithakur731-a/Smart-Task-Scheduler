import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {

    private Queue<Task> pendingTasks;

    public TaskQueue() {
        pendingTasks = new LinkedList<>();
    }


    // Add task in queue
    public void addTask(Task task) {
        pendingTasks.offer(task);
        System.out.println("Task added to queue: " + task.getTitle());
    }


    // Remove next task
    public Task getNextTask() {

        if(pendingTasks.isEmpty()) {
            System.out.println("No pending tasks");
            return null;
        }

        return pendingTasks.poll();
    }


    // View next task without removing
    public Task peekTask() {

        if(pendingTasks.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return pendingTasks.peek();
    }


    // Check queue size
    public int getQueueSize() {
        return pendingTasks.size();
    }


    // Display all pending tasks
    public void displayQueue() {

        if(pendingTasks.isEmpty()) {
            System.out.println("No pending tasks");
            return;
        }

        System.out.println("Pending Tasks:");

        for(Task task : pendingTasks) {
            System.out.println(task.getTitle());
        }
    }
}