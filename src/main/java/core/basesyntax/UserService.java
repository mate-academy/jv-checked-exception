package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator;
    private User user;

    public UserService() {
        this.passwordValidator = new PasswordValidator();
    }

    public void registerUser(User user) {
        try {
            String email = user.getEmail();
            String password = user.getPassword();
            String repeatPassword = user.getRepeatPassword();

            passwordValidator.validate(password, repeatPassword);
            saveUser(email, password, repeatPassword, user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(String email, String password, String repeatPassword, User user) {
        if (email != null && password != null) {
            System.out.println("User " + user.toString() + " was saved to database!!!");

        } else {
            throw new NullPointerException("Email or password is null");
        }
    }
}
