package core.basesyntax;

public class UserService {
    public String registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
            return null;
        }

        String result = saveUser(user);
        System.out.println(result); // <--- это и нужно тесту
        return result;
    }

    public String saveUser(User user) {
        return "User " + user + " was saved to database!!!";
    }
}










