package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();
    private final UserRepository userRepository = new UserRepository();
    private final UserService userService = new UserService();

    public void registerUser(User user, String password, String repeatPassword) {
        try {
            passwordValidator.validate(password, repeatPassword);
            userService.registerUser(user, "password", "repeatPassword");
            userRepository.saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Ваші паролі невірні. Спробуйте ще раз");
        }
    }
}
