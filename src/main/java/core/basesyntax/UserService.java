package core.basesyntax;

// Сервіс для роботи з користувачами
public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public void registerUser(User user) {
        if (user == null) {
            System.out.println("User cannot be nul");
            return;
        }
        try {
            // Перевірка пароля через PasswordValidator
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user); // Збереження користувача
        } catch (PasswordValidationException e) {
            // Обробка винятку
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        // Логіка збереження користувача
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
