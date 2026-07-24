public class ValidationService {

    // Check Empty String
    public boolean isEmpty(String value) {

        if (value == null || value.trim().isEmpty()) {
            return true;
        }

        return false;
    }

    // Email Validation
    public boolean isValidEmail(String email) {

        return email.contains("@") && email.contains(".");
    }

    // Password Validation
    public boolean isValidPassword(String password) {

        return password.length() >= 4;
    }

    // ID Validation
    public boolean isValidId(int id) {

        return id > 0;
    }

    // Due Date Validation
    public boolean isValidDueDate(int dueDate) {

        return dueDate > 0;
    }
}