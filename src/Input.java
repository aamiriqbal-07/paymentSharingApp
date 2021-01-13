import java.util.Scanner;
public class Input {

    public static int input() {
        Scanner in = new Scanner(System.in);
        Integer choice = in.nextInt();
        return choice;
    }
    public static User inputUser() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String phone = in.nextLine();
        User user = new User(name, phone);
        return user;
    }
}
