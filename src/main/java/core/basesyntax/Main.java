package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        User firstUser = new User("vakosovij@gmail.com","1234124","1234567890");
        service.registerUser(firstUser);
        User secondUser = new User("vakosovij@gmail.com","12345678910","12345678910");
        service.registerUser(secondUser);
    }
}
