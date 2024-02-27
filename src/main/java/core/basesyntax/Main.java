package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        User vova = new User("gvs88986@.gmai.com", null, "q12345678910");
        UserService userService = new UserService();
        userService.registerUser(vova);
    }
}
