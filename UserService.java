public class UserService {

    private User[] users = new User[100];
    private int count = 0;

    // Add User
    public void addUser(User user) {
        users[count] = user;
        count++;
        System.out.println("User Added Successfully");
    }

    // Login
    public boolean login(String email, String password) {

        for (int i = 0; i < count; i++) {

            if (users[i].getEmail().equals(email)
                    && users[i].getPassword().equals(password)) {

                return true;
            }
        }

        return false;
    }

    // Total Users
    public int getCount() {
        return count;
    }

    // Get User
    public User getUser(int index) {
        return users[index];
    }

}