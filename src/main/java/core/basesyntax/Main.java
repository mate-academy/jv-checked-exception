package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.registerUser(new User("email@email", null, null));
        service.registerUser(new User("email@email", "null", "null"));
        service.registerUser(new User("email@email", "correctpassword", "correctpassword"));
        service.registerUser(new User("email@email", "wrongpassword", "wrongpasword"));
    }
}
