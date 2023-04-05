package core.basesyntax;

public class Main {
    public static void main(String[] args) throws PasswordValidationException {
        User user = new User("hunterst@ukr.net", null, null);
        String data = user.toString();
        System.out.println(data);
        String userPassword = user.getPassword();
        String userRepeatPassword = user.getRepeatPassword();
        System.out.println(userPassword + "\n" + userRepeatPassword);
        new PasswordValidator().validate(userPassword, userRepeatPassword);
    }
}
