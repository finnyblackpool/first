/**
 * @author Finlayson
 * Menu display class - could look to upgrade to a GUI down the line
 */
public class menus {

	  public static void printMenu(String menuchoice) {
	        switch (menuchoice) {
            case "main":
            	//clearConsole();
            	System.out.println("+-----------+");
                System.out.println("| 1. Login  |");
                System.out.println("| 2. Exit   |");
                System.out.println("+-----------+");
                System.out.println();
            	break;
            case "sub1": 
            	//clearConsole();
    	        System.out.println("+------------------------------------+");
    	        System.out.println("| 1. List all loan objects           |");
    	        System.out.println("| 2. Display loans by branch code    |");
    	        System.out.println("| 3. Query loan by ID                |");
    	        System.out.println("| 4. Display Summary by branch       |");
    	        System.out.println("| 5. Show this months birthday's     |");
    	        System.out.println("| 6. Exit                            |");
    	        System.out.println("+------------------------------------+");
    	        System.out.println("");
            	break;
            default:
            	System.out.println("Invalid selection");
            	break;
	        }
	  }
	  
	  public static void clearConsole() {
		  System.out.println(System.lineSeparator().repeat(30));
		}
  
}
