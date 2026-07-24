import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserService userService = new UserService();
        TaskService taskService = new TaskService();
        SearchService searchService = new SearchService();
        FileManager fileManager = new FileManager();
        LoggerService loggerService = new LoggerService();
Notification notification = new Notification();
CategoryService categoryService = new CategoryService();
ReportService reportService = new ReportService();
ValidationService validationService = new ValidationService();
Reminder reminder = new Reminder();

WorkflowEngine workflowEngine = new WorkflowEngine();
PriorityManager priorityManager = new PriorityManager();
ExecuteTask executeTask = new ExecuteTask();

AnalyticsDashboard analyticsDashboard = new AnalyticsDashboard();
ActivityLogService activityLogService = new ActivityLogService();

DependencyManager dependencyManager = new DependencyManager();
RecurringTaskService recurringTaskService = new RecurringTaskService();

        while (true) {

            System.out.println("\n========== SMART TASK SCHEDULER ==========");
System.out.println("1. Add User");
System.out.println("2. Login");
System.out.println("3. Create Task");
System.out.println("4. Display Tasks");
System.out.println("5. Edit Task");
System.out.println("6. Delete Task");
System.out.println("7. Search Task By ID");
System.out.println("8. Search Task By Title");
System.out.println("9. Save Tasks");
System.out.println("10. Analytics Dashboard");
System.out.println("11. Show Activity Logs");
System.out.println("12. Add Dependency");
System.out.println("13. Show Dependencies");
System.out.println("14. Add Recurring Task");
System.out.println("15. Show Recurring Tasks");
System.out.println("16. Execute Task");
System.out.println("17. Generate Report");
System.out.println("18. Exit");
System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email : ");
                    String email = sc.nextLine();

                    System.out.print("Enter Password : ");
                    String password = sc.nextLine();

                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();

                    User user = new User(name, email, id, password);

                    userService.addUser(user);

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Email : ");
                    String loginEmail = sc.nextLine();

                    System.out.print("Enter Password : ");
                    String loginPassword = sc.nextLine();

                    if (userService.login(loginEmail, loginPassword)) {

                        System.out.println("Login Successful");

                    } else {

                        System.out.println("Login Failed");
                    }

                    break;

                case 3:

                    System.out.print("Enter Task ID : ");
                    int taskId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title : ");
                    String title = sc.nextLine();

                    System.out.print("Enter Description : ");
                    String description = sc.nextLine();

                    System.out.print("Enter Priority : ");
                    String priority = sc.nextLine();

                    System.out.print("Enter Status : ");
                    String status = sc.nextLine();

                    System.out.print("Enter Due Date : ");
                    int dueDate = sc.nextInt();

                    Task task = new Task(taskId, title, description, priority, status, dueDate);

                    taskService.addTask(task);

                    break;

                case 4:

                    taskService.displayTasks();

                    break;
                case 5:

                    System.out.print("Enter Task ID : ");
                    int editId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Title : ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Description : ");
                    String newDescription = sc.nextLine();

                    System.out.print("Enter New Priority : ");
                    String newPriority = sc.nextLine();

                    System.out.print("Enter New Status : ");
                    String newStatus = sc.nextLine();

                    System.out.print("Enter New Due Date : ");
                    int newDueDate = sc.nextInt();

                    if (taskService.editTask(editId, newTitle, newDescription,
                            newPriority, newStatus, newDueDate)) {

                        System.out.println("Task Updated Successfully");

                    } else {

                        System.out.println("Task Not Found");
                    }

                    break;

                case 6:

                    System.out.print("Enter Task ID : ");
                    int deleteId = sc.nextInt();

                    if (taskService.deleteTask(deleteId)) {

                        System.out.println("Task Deleted Successfully");

                    } else {

                        System.out.println("Task Not Found");
                    }

                    break;

                case 7:

                    System.out.print("Enter Task ID : ");
                    int searchId = sc.nextInt();

                    Task foundTask = searchService.searchById(taskService, searchId);

                    if (foundTask != null) {

                        System.out.println("Task Found");
                        System.out.println("ID : " + foundTask.getTaskId());
                        System.out.println("Title : " + foundTask.getTitle());
                        System.out.println("Description : " + foundTask.getDescription());
                        System.out.println("Priority : " + foundTask.getPriority());
                        System.out.println("Status : " + foundTask.getStatus());
                        System.out.println("Due Date : " + foundTask.getDuedate());

                    } else {

                        System.out.println("Task Not Found");
                    }

                    break;

                case 8:

                    sc.nextLine();

                    System.out.print("Enter Title : ");
                    String searchTitle = sc.nextLine();

                    Task titleTask = searchService.searchByTitle(taskService, searchTitle);

                    if (titleTask != null) {

                        System.out.println("Task Found");
                        System.out.println("ID : " + titleTask.getTaskId());
                        System.out.println("Title : " + titleTask.getTitle());
                        System.out.println("Description : " + titleTask.getDescription());
                        System.out.println("Priority : " + titleTask.getPriority());
                        System.out.println("Status : " + titleTask.getStatus());
                        System.out.println("Due Date : " + titleTask.getDuedate());

                    } else {

                        System.out.println("Task Not Found");
                    }

                    break;

                case 9:

                    fileManager.saveTasks(taskService);

                    break;

                case 10:

    analyticsDashboard.displayAnalytics(
            taskService.getTaskCount(),
            taskService.getCompletedTaskCount(),
            taskService.getPendingTaskCount());

    break;

case 11:

    activityLogService.showLogs();

    break;

case 12:

    System.out.print("Enter Task ID : ");
    int taskId1 = sc.nextInt();

    System.out.print("Depends On Task ID : ");
    int dependsId = sc.nextInt();

    TaskDependency dependency =
            new TaskDependency(taskId1, dependsId);

    dependencyManager.addDependency(dependency);

    activityLogService.addLog(
            new ActivityLog(
                    "Dependency Added",
                    "Today",
                    "Now"));

    break;

case 13:

    dependencyManager.showDependencies();

    break;

case 14:

    System.out.print("Enter Task ID : ");
    int recurringTaskId = sc.nextInt();

    sc.nextLine();

    System.out.print("Enter Recurrence Type (Daily/Weekly/Monthly) : ");
    String recurrenceType = sc.nextLine();

    System.out.print("Enter Interval : ");
    int interval = sc.nextInt();

    RecurringTask recurringTask =
            new RecurringTask(
                    recurringTaskId,
                    recurrenceType,
                    interval);

    recurringTaskService.addRecurringTask(recurringTask);

    activityLogService.addLog(
            new ActivityLog(
                    "Recurring Task Added",
                    "Today",
                    "Now"));

    break;

case 15:

    recurringTaskService.showRecurringTasks();

    break;


    case 16:

    System.out.print("Enter Task ID to Execute : ");
    int executeId = sc.nextInt();

    executeTask.execute(executeId);

    activityLogService.addLog(
            new ActivityLog(
                    "Task Executed",
                    "Today",
                    "Now"));

    break;


case 17:

    reportService.generateReport(
        taskService.getTaskCount(),
        taskService.getCompletedTaskCount(),
        taskService.getPendingTaskCount()
);

    break;


case 18:

    System.out.println("Thank You...");
    sc.close();
    return;


default:

    System.out.println("Invalid Choice"); 
            }
        }
    }
}