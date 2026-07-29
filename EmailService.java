public class EmailService {

    public void sendEmail(User user, String message) {

        if (user == null) {

            System.out.println("User Not Found.");
            return;
        }

        System.out.println("Email Sent To : " + user.getEmail());
        System.out.println("Message : " + message);
    }

    public void sendTaskReminder(Task task) {

        System.out.println("Reminder Email : " + task.getTitle());
    }
}