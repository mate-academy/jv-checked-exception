package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        //User fu = new User("qq@qq.qq", "d44bbxdsadd44", "fr4rr");
        //userService.registerUser(fu);
        //User su = new User("ccc@qq.qq", "bbxdsadass4", "bbxdsadass4");
        //userService.registerUser(su);
        User tu = new User("ttt@qq.qq", "bbx", "bbx");
        userService.registerUser(tu);
    }
}
