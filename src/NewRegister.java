import java.util.HashMap;

public class NewRegister {

    static private Integer idCount = 0;
    static HashMap<Integer, User> registeredUser = new HashMap<Integer, User>();
    public static String Register(User user) {
        Boolean validate = Validator.checkRegistry( registeredUser, user );
        if(validate) {
            NewRegister.idCount++;
            registeredUser.put(NewRegister.idCount, user);
            return "New User Created";
        }
        else return "User already present";
    }
}
