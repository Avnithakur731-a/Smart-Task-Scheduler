public class SMSService {

    public void sendSMS(String number, String message) {

        System.out.println("SMS Sent To : " + number);
        System.out.println("Message : " + message);
    }

    public void taskCompleted(Task task) {

        System.out.println("Task Completed SMS : " + task.getTitle());
    }
}