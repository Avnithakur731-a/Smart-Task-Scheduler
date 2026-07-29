public class CustomException extends Exception {

    public CustomException(String message) {

        super(message);
    }

    public static void checkTask(Task task) throws CustomException {

        if (task == null) {

            throw new CustomException("Task Not Found.");
        }
    }

    public static void checkUser(User user) throws CustomException {

        if (user == null) {

            throw new CustomException("User Not Found.");
        }
    }
}