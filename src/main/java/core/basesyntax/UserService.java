package core.basesyntax;

public class UserService {
    public void registerUser(String password, String repeatPassword) {
        PasswordValidator validator = new PasswordValidator();
        try {
            validator.validate(password, repeatPassword);
            saveUser();
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser() {
        System.out.println("User saved successfully!");
    }
}
