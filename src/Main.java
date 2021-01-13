import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Simple Expense Sharing app.!");
        HashMap<Integer, String> inputType = Actions.getActions();
        while(true) {
            System.out.println("Please choose your next action from the list : ");
            for(int i = 1; i <= inputType.size(); i++) {
                System.out.println(i + " " + inputType.get(i));
            }
            int option = Input.input();
            if(option == 1) {
                User user = Input.inputUser();
                String message = NewRegister.Register(user);
                System.out.println(message);
            } else if(option == 2) {
                ShowUsers.displayUsers();
            }
            if(option == 9)  break;
        }
    }
}