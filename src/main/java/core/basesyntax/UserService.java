package core.basesyntax;

public class UserService {
    public static void registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user.getEmail(), user.getPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private static void saveUser(String email, String password) {
        System.out.println("User User{email='" + email + "', password='" + password + "', "
                + "repeatPassword='" + password + "'} was saved to database!!!");
    }
}
