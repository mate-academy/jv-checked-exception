package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("email@gmail.com", "password12", "password1" );
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}
