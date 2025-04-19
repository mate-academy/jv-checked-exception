//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        User user1 = new User("test@example.com", "strongPass1", "strongPass1");
        userService.registerUser(user1);
        User user2 = new User("bad@example.com", "short", "short");
        userService.registerUser(user2);
    }
}
