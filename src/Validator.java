import java.util.HashMap;

public class Validator {

    public static Boolean checkRegistry( HashMap<Integer, User> registeredUser, User user ) {
        for(int i = 0; i< registeredUser.size() ; i++) {
            if( user.getPhone() == registeredUser.get(i).getPhone() ) return false;
        }
        return true;
    }
}
