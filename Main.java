import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Core Services
        UserService userService = new UserService();
        TaskService taskService = new TaskService();
        SearchService searchService = new SearchService();
        FileManager fileManager = new FileManager();

        // Utility Services
        LoggerService loggerService = new LoggerService();
        ValidationService validationService = new ValidationService();
        CategoryService categoryService = new CategoryService();
        ReportService reportService = new ReportService();

        // Workflow
        WorkflowEngine workflowEngine = new WorkflowEngine();
        PriorityManager priorityManager = new PriorityManager();
        ExecuteTask executeTask = new ExecuteTask();
        SchedulerEngine schedulerEngine = new SchedulerEngine();

        // Dashboard
        AnalyticsDashboard analyticsDashboard = new AnalyticsDashboard();
        Dashboard dashboard = new Dashboard();

        // Activity
        ActivityLogService activityLogService = new ActivityLogService();

        // Dependency
        DependencyManager dependencyManager = new DependencyManager();

        // Recurring
        RecurringTaskService recurringTaskService =
                new RecurringTaskService();

        // Statistics
        TaskStatistics taskStatistics = new TaskStatistics();

        // Filter & Sort
        TaskFilter taskFilter = new TaskFilter();
        TaskSorter taskSorter = new TaskSorter();

        // Notification
        NotificationService notificationService =
                new NotificationService();

        ReminderService reminderService =
                new ReminderService();

        // Import Export
        ExportManager exportManager =
                new ExportManager();

        ImportManager importManager =
                new ImportManager();

        // User Session
        UserSession userSession =
                new UserSession();

        // Others
        ScheduleOptimizer scheduleOptimizer =
                new ScheduleOptimizer();

        BackgroundWorker backgroundWorker =
                new BackgroundWorker();

        ThreadPoolManager threadPoolManager =
                new ThreadPoolManager();

        BackupManager backupManager =
                new BackupManager();

        RestoreManager restoreManager =
                new RestoreManager();

        AuditManager auditManager =
                new AuditManager();

        SearchHistory searchHistory =
                new SearchHistory();

        LoginHistory loginHistory =
                new LoginHistory();

        PerformanceMonitor performanceMonitor =
                new PerformanceMonitor();

        SystemMonitor systemMonitor =
                new SystemMonitor();

        DatabaseManager databaseManager =
                new DatabaseManager();

        SecurityManager securityManager =
                new SecurityManager();

        ConfigManager configManager =
                new ConfigManager();

        SettingsManager settingsManager =
                new SettingsManager();

        ObserverManager observerManager =
                new ObserverManager();

        CommandManager commandManager =
                new CommandManager();

        TaskValidator taskValidator =
                new TaskValidator();

        UserReport userReport =
                new UserReport();

        TaskArchive taskArchive =
                new TaskArchive();

        ProjectManager projectManager =
                new ProjectManager();

        dashboard.welcome();
        projectManager.startProject();
        projectManager.initializeModules();

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
            System.out.println("18. Task Statistics");
            System.out.println("19. Filter By Status");
            System.out.println("20. Filter By Priority");
            System.out.println("21. Sort By Due Date");
            System.out.println("22. Sort By Title");
            System.out.println("23. Export Tasks");
            System.out.println("24. Import Tasks");
            System.out.println("25. Exit");

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
                    loggerService.log("New User Added");
                    auditManager.userLogin(user);
                    observerManager.notifyUser("New User Registered");

                    System.out.println("User Added Successfully.");

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Email : ");
                    String loginEmail = sc.nextLine();

                    System.out.print("Enter Password : ");
                    String loginPassword = sc.nextLine();

                    if (userService.login(loginEmail, loginPassword)) {

                        System.out.println("Login Successful");

                        loginHistory.addLogin(loginEmail);

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

                    Task task = new Task(
                            taskId,
                            title,
                            description,
                            priority,
                            status,
                            dueDate);

                    taskService.addTask(task);

                    notificationService.taskCreated(task);

                    activityLogService.addLog(
                            new ActivityLog(
                                    "Task Created",
                                    "Today",
                                    "Now"));

                    observerManager.taskCreated(task);

                    taskValidator.printResult(task);

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

                    if (taskService.editTask(
                            editId,
                            newTitle,
                            newDescription,
                            newPriority,
                            newStatus,
                            newDueDate)) {

                        Task updatedTask =
                                searchService.searchById(taskService, editId);

                        notificationService.taskUpdated(updatedTask);

                        observerManager.taskUpdated(updatedTask);

                        System.out.println("Task Updated Successfully");

                    } else {

                        System.out.println("Task Not Found");
                    }

                    break;

                case 6:

                    System.out.print("Enter Task ID : ");
                    int deleteId = sc.nextInt();

                    if (taskService.deleteTask(deleteId)) {

                        notificationService.taskDeleted(deleteId);

                        observerManager.taskDeleted(deleteId);

                        System.out.println("Task Deleted Successfully");

                    } else {

                        System.out.println("Task Not Found");
                    }

                    break;
                                    case 7:

                    System.out.print("Enter Task ID : ");
                    int searchId = sc.nextInt();

                    Task foundTask =
                            searchService.searchById(taskService, searchId);

                    if (foundTask != null) {

                        System.out.println("Task Found");
                        System.out.println("ID : " + foundTask.getTaskId());
                        System.out.println("Title : " + foundTask.getTitle());
                        System.out.println("Description : " + foundTask.getDescription());
                        System.out.println("Priority : " + foundTask.getPriority());
                        System.out.println("Status : " + foundTask.getStatus());
                        System.out.println("Due Date : " + foundTask.getDuedate());

                        searchHistory.addHistory(
                                "Search By ID : " + searchId);

                    } else {

                        System.out.println("Task Not Found");
                    }

                    break;

                case 8:

                    sc.nextLine();

                    System.out.print("Enter Title : ");
                    String searchTitle = sc.nextLine();

                    Task titleTask =
                            searchService.searchByTitle(
                                    taskService,
                                    searchTitle);

                    if (titleTask != null) {

                        System.out.println("Task Found");
                        System.out.println("ID : " + titleTask.getTaskId());
                        System.out.println("Title : " + titleTask.getTitle());
                        System.out.println("Description : " + titleTask.getDescription());
                        System.out.println("Priority : " + titleTask.getPriority());
                        System.out.println("Status : " + titleTask.getStatus());
                        System.out.println("Due Date : " + titleTask.getDuedate());

                        searchHistory.addHistory(
                                "Search By Title : " + searchTitle);

                    } else {

                        System.out.println("Task Not Found");
                    }

                    break;

                case 9:

                    fileManager.saveTasks(taskService);

                    loggerService.log("Tasks Saved");

                    break;

                case 10:

                    analyticsDashboard.displayAnalytics(

                            taskService.getTaskCount(),
                            taskService.getCompletedTaskCount(),
                            taskService.getPendingTaskCount());

                    taskStatistics.showStatistics(taskService);

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
                            new TaskDependency(
                                    taskId1,
                                    dependsId);

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

                    System.out.print("Enter Recurrence Type : ");

                    String recurrenceType =
                            sc.nextLine();

                    System.out.print("Enter Interval : ");

                    int interval = sc.nextInt();

                    RecurringTask recurringTask =
                            new RecurringTask(

                                    recurringTaskId,
                                    recurrenceType,
                                    interval);

                    recurringTaskService.addRecurringTask(
                            recurringTask);

                    activityLogService.addLog(

                            new ActivityLog(
                                    "Recurring Task Added",
                                    "Today",
                                    "Now"));

                    break;

                case 15:

                    recurringTaskService.showRecurringTasks();

                    reminderService.checkAllReminders(taskService);

                    break;
                                    case 16:

                    System.out.print("Enter Task ID To Execute : ");
                    int executeId = sc.nextInt();

                    performanceMonitor.start();

                    executeTask.execute(executeId);

                    backgroundWorker.execute(
                            searchService.searchById(taskService, executeId));

                    threadPoolManager.executeTask(
                            searchService.searchById(taskService, executeId));

                    activityLogService.addLog(
                            new ActivityLog(
                                    "Task Executed",
                                    "Today",
                                    "Now"));

                    performanceMonitor.stop();
                    performanceMonitor.showExecutionTime();

                    break;

                case 17:

                    reportService.generateReport(
                            taskService.getTaskCount(),
                            taskService.getCompletedTaskCount(),
                            taskService.getPendingTaskCount());

                    exportManager.exportTasks(taskService);

                    userReport.generate(userService);

                    break;

                case 18:

                    taskStatistics.showStatistics(taskService);

                    taskStatistics.showCompletionPercentage(taskService);

                    break;

                case 19:

                    sc.nextLine();

                    System.out.print("Enter Status : ");
                    String filterStatus = sc.nextLine();

                    taskFilter.filterByStatus(
                            taskService,
                            filterStatus);

                    break;

                case 20:

                    sc.nextLine();

                    System.out.print("Enter Priority : ");
                    String filterPriority = sc.nextLine();

                    taskFilter.filterByPriority(
                            taskService,
                            filterPriority);

                    break;

                case 21:

                    taskSorter.sortByDueDate(taskService);

                    taskSorter.display(taskService);

                    break;

                case 22:

                    taskSorter.sortByTitle(taskService);

                    taskSorter.display(taskService);

                    break;

                case 23:

                    exportManager.exportTasks(taskService);

                    backupManager.createBackup(taskService);

                    break;

                case 24:

                    importManager.importTasks();

                    restoreManager.restoreTasks();

                    break;

                case 25:

                    systemMonitor.showSystemStatus();

                    settingsManager.showSettings();

                    projectManager.showProjectInfo();

                    projectManager.shutdownProject();

                    dashboard.exit();

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}