import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Simple Expense Sharing app.!");
        System.out.println("Please choose your next action from the list : ");
        ArrayList<String> inputType = Actions.getActions();
        for(String S:inputType) {
            System.out.println(S);
        }
    }
}