package core.basesyntax;

public class UserRepository {
    public void saveUser(User user) {
        // Logic to save the user (e.g., to a database or a list)
        System.out.println("User " + user.toString() + " has been saved.");
    }
}