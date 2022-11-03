package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try{
            validate();
        } catch (Exception e) {
            System.out.println("Your passwords are incorrect. Try again.");
        } saveUser(user);
    }

    private void validate() {
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
