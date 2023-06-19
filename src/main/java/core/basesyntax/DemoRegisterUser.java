package core.basesyntax;

public class DemoRegisterUser {
    public static void main(String[] args) {
        UserService userService = new UserService();
//        User user = new User("UserLogin", "Qwerty1234", "Qwerty1234");
        User user = new User("UserLogin", "Qwerty1234", "4321ytrewQ");
        userService.registerUser(user);
    }
}
