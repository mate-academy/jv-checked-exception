package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();
    private final UserRepository userRepository = new UserRepository();

    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            user.setPassword(user.getPassword());
            userRepository.saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}
