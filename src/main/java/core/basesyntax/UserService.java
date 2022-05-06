package core.basesyntax;

public class UserService {
    public static void registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (NullPointerException e) {
            System.out.println("Ваші паролі неправильні. Спробуйте ще раз.");
        } catch (PasswordValidationException e) {
            //System.out.println("Ваші паролі неправильні. Спробуйте ще раз.");
        }
    }

    private static void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
