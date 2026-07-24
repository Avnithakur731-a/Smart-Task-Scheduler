import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserService userService = new UserService();
        TaskService taskService = new TaskService();
        SearchService searchService = new SearchService();
        FileManager fileManager = new FileManager();

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
            System.out.println("10. Exit");
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

                    System.out.println("Thank You...");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}