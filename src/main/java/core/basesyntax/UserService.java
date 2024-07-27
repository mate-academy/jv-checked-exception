package core.basesyntax;

public class UserService {

    public void registerUser(User user) {
        try {
            passwordValidate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
            System.out.println("User " + user + " was saved to database!!!");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void passwordValidate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null");
        }
        if (password.isEmpty() || repeatPassword.isEmpty()) {
            throw new PasswordValidationException("Passwords cannot be empty");
        }
        if (password.length() < 6) {
            throw new PasswordValidationException("Passwords must be at least 6 characters long");
        }
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match");
        }
    }

    private void saveUser(User user) {
    }
}
