//used as the User login interface for the bookstore system
import java.util.*;
public class UserAuthentication {
    Scanner user=new Scanner(System.in);
    private String username; // Replace with actual username
    private String password; // Replace with actual password

    public void Signup() {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = user.next();
        System.out.print("Enter password: ");
        password = user.next();
        System.out.print("User Account Created!\n");

    }
    public void Login(){

        System.out.print("Enter username: ");
        String inputUsername = user.next();
        System.out.print("Enter password: ");
        String inputPassword = user.next();

        if(inputUsername.equals(username) && inputPassword.equals(password)){
            System.out.println("User Account Authenticated");
        }
        else {
            System.out.println("Authentication Failure. Incorrect Username and/or Password");
        }
    }
}
