public class DependencyManager {

    private TaskDependency[] dependencies = new TaskDependency[100];
    private int count = 0;

    // Add Dependency
    public void addDependency(TaskDependency dependency) {

        dependencies[count] = dependency;
        count++;

        System.out.println("Dependency Added Successfully");
    }

    // Display All Dependencies
    public void showDependencies() {

        if (count == 0) {
            System.out.println("No Dependencies Found");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("---------------------------");
            dependencies[i].displayDependency();
        }
    }

    // Total Dependencies
    public int totalDependencies() {

        return count;
    }

    // Remove All Dependencies
    public void clearDependencies() {

        count = 0;
        System.out.println("All Dependencies Removed");
    }
}