package core.basesyntax;

public class Mine {
    public static void main(String[] args) {
        User user1 = new User("yurii.storozhuk@gmail.com", "1234567890", "1234567890");
        PasswordValidator test = new PasswordValidator(user1);
        user1.validate();



    }
}
