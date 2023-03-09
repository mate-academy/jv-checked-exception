package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        String email = "this email";
        String password = "this password";
        String repeatPassword = "this password";
        User user = new User(email, password, repeatPassword);
        UserService service = new UserService();
        service.registerUser(user);
    }
}
