package core.basesyntax;

public class UserService {
    private PasswordValidator pv;

    public UserService() {
        this.pv = new PasswordValidator();
    }

    public void registerUser(User user) {
    
        try {
            pv.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException pve) {
            System.out.println(pve.getMessage());
        } 
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
