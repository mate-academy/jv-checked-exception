import java.util.HashSet;
public class UserServise {
   private String password;
    private  String repeatPassword;
   private PasswordValidator passwordValidator = new PasswordValidator();
    HashSet<String> BaseUser = new HashSet<String>();
    public void registerUser(String password,String repeatPassword )  {
     try {
         passwordValidator.validate(password, repeatPassword);
     }
     catch (PasswordValidationException n){
         System.out.println(n);
     }
        }
    public void SaveUser() {
        BaseUser.add(password);
    }
}
