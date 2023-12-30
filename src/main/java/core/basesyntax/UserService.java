package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        //write your code here
        PasswordValidator passwordValidator = new PasswordValidator();
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();
        try {
            passwordValidator.validate(password, repeatPassword);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
