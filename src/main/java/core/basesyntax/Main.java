package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("email@email.com", "short", "short");

        User user2 = new User(
                "correct@email.com",
                "longpassword123",
                "longpassword123"
        );

        UserService service = new UserService();

        service.registerUser(user1); // -> prints "Your passwords are incorrect. Try again."
        service.registerUser(user2); // -> saves user to database
    }
}
