package src;
import java.util.Scanner;

public class Login {

    Scanner scan = new Scanner(System.in);

    private String name = "Sanjay";
    private String pass = "17";

    public boolean LOGIN(){
        System.out.println("Enter name and password: ");
        
        String name = scan.next();
        String password = scan.next();

        if (this.name.equalsIgnoreCase(name) && pass.equalsIgnoreCase(password)){
            System.out.println("Welcome");
            return true;
        }
        if (this.name.equalsIgnoreCase(name)==true && pass.equalsIgnoreCase(password)==false){
            System.out.println("Name is correct but wrong password");
        }
        else if (this.name.equalsIgnoreCase(name)==false && pass.equalsIgnoreCase(password)==true){
            System.out.println("Name is wrong but password is correct");
        }
        else if (this.name.equalsIgnoreCase(name)==false && pass.equalsIgnoreCase(password)==false) {
            System.out.println("Wrong credentials");
        }
        return false;
    }
}
