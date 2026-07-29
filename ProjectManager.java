public class ProjectManager {

    public void startProject() {

        System.out.println("======================================");
        System.out.println(" SMART TASK SCHEDULER STARTED ");
        System.out.println("======================================");
    }

    public void initializeModules() {

        System.out.println("Loading User Module...");
        System.out.println("Loading Task Module...");
        System.out.println("Loading Search Module...");
        System.out.println("Loading Scheduler...");
        System.out.println("Loading Analytics...");
        System.out.println("Loading Reports...");
        System.out.println("Loading Notifications...");
        System.out.println("All Modules Loaded Successfully.");
    }

    public void showProjectInfo() {

        System.out.println("\n========== PROJECT INFO ==========");
        System.out.println("Project : Smart Task Scheduler");
        System.out.println("Language : Java");
        System.out.println("Architecture : Object Oriented");
        System.out.println("Classes : 60+");
        System.out.println("Modules : 10+");
        System.out.println("==================================");
    }

    public void shutdownProject() {

        System.out.println("\nSaving Data...");
        System.out.println("Closing Background Services...");
        System.out.println("Project Closed Successfully.");
    }
}