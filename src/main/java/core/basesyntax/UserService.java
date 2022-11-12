package core.basesyntax;

public class UserService {
    public void registerUser(User user) throws PasswordValidationException {
        PasswordValidator validator = new PasswordValidator();

        try {
            validator.validate(user);
        } catch (PasswordValidationException e) {
            throw new PasswordValidationException();
        } finally {
            saveUser();
    }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
