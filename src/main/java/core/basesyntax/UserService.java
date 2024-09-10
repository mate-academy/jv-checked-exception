package core.basesyntax;

public class UserService {
    private PasswordValidator passwordvalidator = new PasswordValidator();
    public void registerUser(String password, String repeatPassword) {
        try {
            passwordvalidator.validate(password, repeatPassword);
            saveUser();
            System.out.println("User successfully registered!");

        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser() {
        System.out.println("User saved to database");
    }
}
