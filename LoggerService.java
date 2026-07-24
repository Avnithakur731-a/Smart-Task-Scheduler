public class LoggerService {

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public void info(String message) {
        System.out.println("[INFO] " + message);
    }

    public void warning(String message) {
        System.out.println("[WARNING] " + message);
    }

    public void error(String message) {
        System.out.println("[ERROR] " + message);
    }
}