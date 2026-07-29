public class SecurityManager {

    public boolean authenticate(String username,
                                String password) {

        if (username.equals("admin")
                && password.equals("admin123")) {

            return true;
        }

        return false;
    }

    public void encrypt() {

        System.out.println("Data Encrypted.");
    }

    public void decrypt() {

        System.out.println("Data Decrypted.");
    }
}