package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(String password, String repeatPassword) {
        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser();
        } catch (PasswordValidationException e) {
            System.out.println("Ваші паролі неправильні. Повторіть спробу.");
        }
    }

    private void saveUser() {
        // Логіка збереження користувача в базі даних
        System.out.println("Користувача збережено в базі даних.");
    }
}

