import java.util.HashMap;

    public class Actions {
        public static HashMap<Integer, String> getActions() {
            HashMap<Integer, String> inputType = new HashMap<Integer, String>();
            inputType.put(1, "Register a new user");
            inputType.put(2, "Display all registered users");
            inputType.put(3, "Edit an already added user");
            inputType.put(4, "Add a new expense");
            inputType.put(5, "Display all added expenses");
            inputType.put(6, "Edit an already existing expense");
            inputType.put(7, "Delete an expense");
            inputType.put(8, "Display Debt");
            inputType.put(9, "To Exit");
            return inputType;
        }
}
