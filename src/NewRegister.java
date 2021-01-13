import java.util.HashMap;

public class NewRegister {

    static private Integer idCount = 0;
    static HashMap<Integer, User> registeredUser = new HashMap<Integer, User>();
    public static String Register(User user) {
        if( !Validator.phoneValidity(user.getPhone()) ) {
            return "Invalid Phone!";
        }

        Boolean validate = Validator.checkRegistry( registeredUser, user );
        if(validate) {
            NewRegister.idCount++;
            registeredUser.put(NewRegister.idCount, user);
            return "New User Created";
        }
        else return "User already present";
    }

    public static Integer getIdCount() {
        return idCount;
    }

    public static void setIdCount(Integer idCount) {
        NewRegister.idCount = idCount;
    }

    public static HashMap<Integer, User> getRegisteredUser() {
        return registeredUser;
    }

    public static void setRegisteredUser(HashMap<Integer, User> registeredUser) {
        NewRegister.registeredUser = registeredUser;
    }
}
