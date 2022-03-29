package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        System.out.println("Test user with invalid password:");
        User registeringUser1 = new User(
                "some@gmail.com",
                "superpass",
                "superpass");
        service.registerUser(registeringUser1);

        System.out.println("Test user with valid password:");
        User registeringUser2 = new User(
                "some@gmail.com",
                "massive-super-pass",
                "massive-super-pass");
        service.registerUser(registeringUser2);
    }
}
