import java.util.HashMap;

public class ShowUsers {

    public static void displayUsers() {
        HashMap<Integer, User> registeredUser = NewRegister.getRegisteredUser();
        if(registeredUser.size() == 0) {
            System.out.println("No Registered User");
        } else {
            for(int i=1; i<=registeredUser.size(); i++) {
                System.out.println(i + " " + registeredUser.get(i).getName()
                          + " " + registeredUser.get(i).getPhone());
            }
        }
        return;
    }
}
