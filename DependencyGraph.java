public class DependencyGraph {

    private TaskDependency[] graph = new TaskDependency[100];

    private int count = 0;

    public void addDependency(TaskDependency dependency) {

        graph[count] = dependency;
        count++;

        System.out.println("Dependency Added.");
    }

    public void displayGraph() {

        System.out.println("\n===== Dependency Graph =====");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    graph[i].getTaskId()
                            + " --> "
                            + graph[i].getDependsOnTaskId()
            );
        }
    }

    public int getCount() {

        return count;
    }
}