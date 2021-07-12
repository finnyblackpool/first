import java.util.ArrayList;
/**
 * @author Finlayson
 *
 */
public class Banking {

	  public static void main(String[] args) {
		  
        // Local variables
        int OptValue1; int OptValue2; int OptValue3; int OptValue4; 
        int OptValue5; int OptValue6; int OptValue7; int OptValue8; 
        boolean IsAdmin = false;
        boolean Remain = true;
        boolean StayLogged = false;
      
      while (Remain == true) {
        
    	if (StayLogged == false) { 
	    	menus.printMenu("main");
	        OptValue1 = keyinput.inInt("Please, enter your option:  ");
	    	System.out.println();
	    	
	        switch (OptValue1) {
	            case 1:
	            	System.out.println("Login selected");
	            	break;
	            case 2: 
	            	menus.clearConsole(); 
	            	System.out.println("Exit selected. Byeeeee!");
	            	System.exit(0);
	            	break;
	            default:
	            	System.out.println("Invalid selection");
	            	break;
	        }
        }
        
        if(IsAdmin==false) {     
        	System.out.println("Lets get you logged in.");     
        	do {
        	    adminlogin c = new adminlogin();
        		IsAdmin = c.adminlogin(null);
        	} while(IsAdmin == false);
        }
        
        if(IsAdmin==true) {
        	if(StayLogged == false ) {
	        	System.out.println("Importing the data set."); 
	        	CSVparser accountdata = new CSVparser();
	        	// Todo CodeMentor CSVparser is intended to load a dataset into memory and it be fully available. It isn't 'passing back'
	            //for (int i=0;i<accountdata.size();i+++) {
	            //    System.out.printf("%s ",accountdata.get(i));
	            //}
	        	System.out.println("Importing data complete.");
        	}
        	// Get the submenu on screen
            menus.printMenu("sub1");
	        int OptValue21 = keyinput.inInt("Please, enter your option: ");
        	System.out.println();
        	
	        switch (OptValue21) {
	        case 1:
	        	menus.clearConsole(); 
	        	System.out.println("List all loan objects");
	        	System.out.println("=====================");
	        	System.out.println();
	        	// Todo CodeMentor Want to pull in all the loan accounts pulled in via CSV Parser
	        	System.out.println("LoanID Firstname Surname LoanAmount ");
	        	System.out.println("LoanID Firstname Surname LoanAmount ");
	        	System.out.println("LoanID Firstname Surname LoanAmount ");
	        	System.out.println("LoanID Firstname Surname LoanAmount ");
	        	System.out.println("LoanID Firstname Surname LoanAmount ");
	        	System.out.println("LoanID Firstname Surname LoanAmount ");
	        	System.out.println("LoanID Firstname Surname LoanAmount ");
	        	System.out.println();
	        	StayLogged = true;
	        	break;
	        case 2: 
	        	menus.clearConsole(); 
	        	System.out.println("Display loans by branch code");
	        	System.out.println("============================");
	            OptValue3 = keyinput.inInt("Enter the branch code you wish to display loans: ");
	        	System.out.println();
	        	System.out.println("These are the loans of Branch " + OptValue3);
	        	// Todo CodeMentor Want to pull in all the loan accounts for OptValue3 from CSVParser
	        	System.out.println("Loan LoanID for customer Surname - Initial. - Firstname");
	        	System.out.println("Loan LoanID for customer Surname - Initial. - Firstname");
	        	System.out.println("Loan LoanID for customer Surname - Initial. - Firstname");
	        	System.out.println("Loan LoanID for customer Surname - Initial. - Firstname");
	        	System.out.println();
	        	StayLogged = true;
		        break;
	        case 3: 
	        	menus.clearConsole(); 
	        	System.out.println("Query loan by ID");
	        	System.out.println("================");
	            OptValue4 = keyinput.inInt("Enter the loan ID you want to query: ");
	        	// Todo CodeMentor Allow the choice of a loanid from CSVparser - request 3 characters from passcode
	            OptValue5 = keyinput.inInt("Enter Character 3 of the loan pass code: ");
	            OptValue6 = keyinput.inInt("Enter Character 5 of the loan pass code: ");
	            OptValue7 = keyinput.inInt("Enter Character 8 of the loan pass code: ");
	            // Todo CodeMentor with an exact match of the pass code, display the loanid data (replace data below)
	            System.out.println();
	            System.out.println("Here is the information of loan ID "+ OptValue4 + ":");
	            System.out.println("=========================================");
	            System.out.println("Customer name: Andrew N Finlayson");
	            System.out.println("Branch code: 1");
	            System.out.println("Gender: M");
	            System.out.println("Date of birth: 01/11/1994");
	            System.out.println("Loan amount 539.09");
	            System.out.println("Customer phone: 210-899-2259");
	            System.out.println();
	            StayLogged = true;
		        break;
	        case 4: 
	        	menus.clearConsole(); 
	        	System.out.println("Display Summary by branch");
	        	System.out.println("=========================");
	            OptValue8 = keyinput.inInt("Enter the branch code you wish to summarise: ");
	        	System.out.println();
	        	System.out.println("Summary of Branch " + OptValue8);
	        	// Todo CodeMentor Want to complete these summaries from the data pulled in via CSVparser
	        	System.out.println("Total loans from the Branch xxxxxxxxxxx"); //Total of loanamount filtered by branch
	        	System.out.println("Total loans from Male customers xxx"); // Total loan amount filtered by branch - where gender = M
	        	System.out.println("Total loans from Female customers xxx"); // Total loan amount filtered by branch - where gender = F
	        	System.out.println("Lowest loan value from the Branch"); //Min loanamount filtered by branch (equal to OptValue2)
	        	System.out.println("Highest loan value from the Branch"); //Max loanamount filtered by branch (equal to OptValue2)
	        	System.out.println("Average loan value from the Branch"); //Avg loanamount filtered by branch (equal to OptValue2)
	        	System.out.println();
	        	StayLogged = true;
		        break;
	        case 5: 
	        	menus.clearConsole(); 
	        	System.out.println("Show this months birthday's");
	        	System.out.println("===========================");
	        	System.out.println();
	        	// Todo CodeMentor Want to complete this list from the data pulled in via CSVparser
	        	System.out.println("These are the birthdays from the bank for xxxxxx"); // replace xxxxx with the current month
	        	System.out.println("Surname - Initial. - Firstname    ---- DOB"); // display these fields from arraylist (CSVparser) = currentmonth
	        	System.out.println("Surname - Initial. - Firstname    ---- DOB");
	        	System.out.println("Surname - Initial. - Firstname    ---- DOB");
	        	System.out.println("Surname - Initial. - Firstname    ---- DOB");
	        	System.out.println("Surname - Initial. - Firstname    ---- DOB");
	        	System.out.println("Surname - Initial. - Firstname    ---- DOB");
	        	System.out.println("Surname - Initial. - Firstname    ---- DOB");
	        	System.out.println();
	        	StayLogged = true;
	        	break;
	        case 6: 
	        	menus.clearConsole(); 
	        	System.out.println("Exit it is. Main menu here we come.");
	        	// menus.clearConsole(); 
	        	StayLogged = false;
	        	Remain = true;
	        	break;
	        default:
	        	menus.clearConsole(); 
	        	System.out.println("Invalid choice, I'll assume exit");
	        	Remain = false;
	        	StayLogged = false;
	        	break;
	        }
        } else {
        		System.out.println("This shouldn't happen.");     
        }
	}
      System.exit(0);
	  }
}

