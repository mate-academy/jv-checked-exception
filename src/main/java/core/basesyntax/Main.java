package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService Service = new UserService();
        User fu = new User("qq@qq.qq", "d44bbxdsadd44", "fr4rr");
        Service.registerUser(fu);
        User su = new User("ccc@qq.qq", "bbxdsadass4", "bbxdsadass4");
        Service.registerUser(su);
        User tu = new User("ttt@qq.qq", "bbx", "bbx");
        Service.registerUser(tu);
    }
}