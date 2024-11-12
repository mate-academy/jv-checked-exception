//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    UserServise userService = new UserServise();
        userService.registerUser("хрякРыба111" , "хрякРыба111");
        userService.SaveUser();
        userService.registerUser("hih", "hi");
        userService.SaveUser();
    for(String password : userService.BaseUser){
        System.out.println(password);
    }
        }
    }