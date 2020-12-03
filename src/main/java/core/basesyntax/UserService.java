package core.basesyntax;

public class UserService {

    public void registerUser(User user) {

        try {

            PasswordValidator validator = new PasswordValidator();
            UserService userService = new UserService();

            if(validator.validate(user.getPassword(), user.getRepeatPassword())){
                userService.saveUser(user);
            } else {
                throw new PasswordValidationException("Wrong passwords");
            }

        } catch (PasswordValidationException e){
            System.out.println("Your passwords are incorrect. Try again.");
        }

    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to data base!!!");
    }
}
