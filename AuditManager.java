public class AuditManager {

    public void log(String action) {

        System.out.println("[AUDIT] " + action);
    }

    public void userLogin(User user) {

        System.out.println(user.getName() + " Logged In.");
    }

    public void taskCreated(Task task) {

        System.out.println("Task Created : " + task.getTitle());
    }

    public void taskDeleted(int id) {

        System.out.println("Task Deleted : " + id);
    }
}