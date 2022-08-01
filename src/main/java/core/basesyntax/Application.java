package core.basesyntax;

public class Application {
    public static void main (String [] args) {

        UserService us = new UserService();
        us.registerUser(new User("www","qwe11111111","qwe111111121"));
    }
}
