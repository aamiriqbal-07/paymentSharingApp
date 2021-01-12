import java.util.ArrayList;

    public class Actions {
        public static ArrayList<String> getActions() {
            ArrayList<String>  inputType = new ArrayList<String>();
            inputType.add("1 - Register a new user");
            inputType.add("2 - Display all registered users");
            inputType.add("3 - Edit an already added user");
            inputType.add("4 - Add a new expense");
            inputType.add("5 - Display all added expenses");
            inputType.add("6 - Edit an already existing expense");
            inputType.add("7 - Delete an expense");
            return inputType;
        }
}
