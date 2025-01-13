package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        //Poprawne hasła
        User user1 = new User("email4","CorrectPassword123", "CorrectPassword123");
        userService.registerUser(user1);

        //Niepoprawne hasła
        User user2 = new User("email5","short", "short");
        userService.registerUser(user2);

        //Hasła niezgodne
        User user3 = new User("email6","CorrectPassword123", "DifferentPassword123");
        userService.registerUser(user3);

        //Hasła null
        User user4 = new User("email7",null, null);
        userService.registerUser(user4);
    }
}
