import java.util.HashMap;

public class Validator {

    public static Boolean phoneValidity(String phone) {
        if(phone.length() == 10)  return true;
        return false;
    }

    public static Boolean checkRegistry( HashMap<Integer, User> registeredUser, User user ) {

        for (int i = 1; i <= registeredUser.size(); i++) {
            if (user.getPhone() == registeredUser.get(i).getPhone()) return false;
        }
        return true;
    }
}
