package core.basesyntax;

public class UserService {
        public void registerUser(User user){
            PasswordValidator pv=new PasswordValidator();
            try {
                pv.validate(user.getPassword(),user.getRepeatPassword());
                saveUser(user);

            }catch (PasswordValidationException pve){
                System.out.println("Your passwords are incorrect. Try again.");

            }

    }

    public void saveUser(User user){
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
