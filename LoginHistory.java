public class LoginHistory {

    private String[] users = new String[100];
    private int count = 0;

    public void addLogin(String email) {

        users[count] = email;
        count++;

        System.out.println("Login Recorded.");
    }

    public void showHistory() {

        System.out.println("\n===== LOGIN HISTORY =====");

        for (int i = 0; i < count; i++) {

            System.out.println(users[i]);
        }
    }
}