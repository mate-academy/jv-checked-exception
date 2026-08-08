package core.basesyntax;

public class UserStorage {
    public void saveUser(User user) {
        // у реальній задачі це б був запис у базу
        System.out.println("User " + user.getLogin() + " was saved");
    }
}




