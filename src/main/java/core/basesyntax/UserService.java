package core.basesyntax;

public class UserService {

    private  String password;
    private String repeatPassword;

    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            passwordValidator.validate(password, repeatPassword);
        } catch (PasswordValidationException e) {
            throw new RuntimeException("Your passwords are incorrect. Try again");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
