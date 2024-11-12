//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
    UserServise user = new UserServise();
    user.registerUser("хряк" , "хряк");
    user.SaveUser();
    user.registerUser("hih", "hi");
    user.SaveUser();
    for(String i : user.BaseUser){
        System.out.println(i);
    }
        }
    }