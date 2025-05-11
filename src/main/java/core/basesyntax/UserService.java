package core.basesyntax;

public class UserService {
    private final UserDatabase userDatabase = new UserDatabase(); // Імітація БД

    /**
     * Registers a user if the password is valid.
     *
     * @param username       user's name
     * @param password       user's password
     * @param repeatPassword repeated password for validation
     */
    public void registerUser(String username, String password, String repeatPassword) {
        PasswordValidator validator = new PasswordValidator();

        try {
            validator.validate(password, repeatPassword);
            userDatabase.saveUser(username, password);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}
