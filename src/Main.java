import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Simple Expense Sharing app.!");
        System.out.println("Please choose your next action from the list : ");
        HashMap<Integer, String> inputType = actions.getActions();
        for(int i = 1; i <= inputType.size(); i++) {
            System.out.println(inputType.get(i));
        }
        int userAction = getInput.input();
        System.out.println(inputType.get(userAction));
    }
}