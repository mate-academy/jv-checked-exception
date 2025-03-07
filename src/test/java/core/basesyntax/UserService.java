package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    // Видаліть усі інші версії методу `registerUser`
    public void registerUser(User user) {
        try {
            passwordValidator.validate(user.password(), user.repeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Ваші паролі неправильні. Повторіть спробу.");
        }
    }

    private void saveUser(User user) {
        // Логіка збереження користувача в базі даних
        System.out.println("Користувача " + user.email() + " збережено в базі даних.");
    }
}
