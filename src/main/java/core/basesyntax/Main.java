package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        //Poprawne hasła
        User user1 = new User("email1","CorrectPassword123", "CorrectPassword123");
        userService.registerUser(user1);

        //Niepoprawne hasła
        User user2 = new User("email2","short", "short");
        userService.registerUser(user2);

        //Hasła niezgodne
        User user3 = new User("email3","CorrectPassword123", "DifferentPassword123");
        userService.registerUser(user3);
    }
}
