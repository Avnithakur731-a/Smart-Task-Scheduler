public class User {

    private String name;
    private String email;
    private int id;
    private String password;

    // Constructor
    public User(String name, String email, int id, String password) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.password = password;
    }

    // Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // ID
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Password
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    // toString()
    @Override
    public String toString() {
        return "User ID : " + id +
               "\nName : " + name +
               "\nEmail : " + email;
    }
}