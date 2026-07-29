public class UserSession {

    private User currentUser;

    // Login User
    public void login(User user) {

        currentUser = user;

        System.out.println("Welcome " + currentUser.getName());
    }

    // Logout User
    public void logout() {

        if (currentUser != null) {

            System.out.println(currentUser.getName() + " Logged Out.");

            currentUser = null;

        } else {

            System.out.println("No User Logged In.");
        }
    }

    // Check Login
    public boolean isLoggedIn() {

        return currentUser != null;
    }

    // Get Current User
    public User getCurrentUser() {

        return currentUser;
    }
}