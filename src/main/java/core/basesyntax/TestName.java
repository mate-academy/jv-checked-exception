package core.basesyntax;

public class TestName {
    public static void main(String[] args) throws PasswordValidationException {
        User tomek = new User("hallo@gmail.com", "1231231230", "1231231230");
        UserService userService = new UserService();
        userService.registerUser(tomek);
    }
}
