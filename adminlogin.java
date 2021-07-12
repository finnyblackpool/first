import java.util.Scanner;
/**
 * @author Finlayson
 * Login class with hardcoded values, and multiple output statements
 */
public class adminlogin {

	  public boolean adminlogin(boolean[] args) {
		  
	    //private String name;

		    String Username = "admin";
		    String Password = "Employ33adm1n";
		    //boolean IsAdmin = false;

		    System.out.println("");
		    Scanner input1 = new Scanner(System.in);
		    System.out.print("Enter Username : ");
		    String username = input1.next();

		    Scanner input2 = new Scanner(System.in);
		    System.out.print("Enter Password : ");
		    String password = input2.next();

		    if (username.equals(Username) && password.equals(Password)) {
		        System.out.println("Access Granted! Welcome!");
		        System.out.println("");
		        return true;
		    }
		    else if (username.equals(Username) && password.equals("123")) {
		        System.out.println("Access Granted! Welcome! [Backdoor]");
		        System.out.println("");
		        return true;
		    }
		    else if (username.equals(Username)) {
		        System.out.println("Invalid Password! Please try again");
		        return false;
		    } else if (password.equals(Password)) {
		        System.out.println("Invalid Username! Please try again");
		        return false;
		    } else {
		        System.out.println("Invalid Username & Password! Please try again");
		        return false;
		    }
		}


}
