package core.basesyntax;

public class UserService {
    private String password;
    private String repeatPassword;

    public void registerUser(User user) {

        PasswordValidator validator = new PasswordValidator();

        password = user.getPassword();

        repeatPassword = user.getRepeatPassword();

        try {
            validator.validate(password, repeatPassword);
            saveUser(user);
        } catch (PasswordValidationException e){
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
