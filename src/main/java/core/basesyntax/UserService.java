package core.basesyntax;

public class UserService {
    private static final String ERROR_PASSWORDS = "Your passwords are incorrect. Try again.";

    public void registerUser(User user) {
        //write your code here
        String userEmail = user.getEmail();
        String userPassword = user.getPassword();
        String userRepeatPassword = user.getRepeatPassword();
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(userPassword, userRepeatPassword);
            saveUser(user);
        } catch (Exception e) {
            System.out.println(ERROR_PASSWORDS);
        }
    }

    public void saveUser(User user) {
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        user.setRepeatPassword(user.getRepeatPassword());
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
