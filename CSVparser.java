import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Finlayson
 * Customer Mortgage CSV processing routines - loading data into an arraylist
 */
public class CSVparser {

	//public static void main(ArrayList<String> languages) {
	public static void main(String... args) {
        List<Account> accounts = readBankRecFromCSV("C:\\Users\\andre\\eclipse-workspace\\Jade 07-2021\\src\\customermortgage.csv");

        // let's print all the accounts read from CSV file
        for (Account b : accounts) {
            System.out.println(b);
        }
    }

    private static List<Account> readBankRecFromCSV(String fileName) {
        List<Account> accounts = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                //System.out.println(line);
                Account account = createAccount(attributes);

                // adding account into ArrayList
                accounts.add(account);
                // Debug info - what is the size of the arraylist
                //System.out.println(accounts.size());
                // Debug info - display a record from the arraylist
                //System.out.println(accounts.get(0));
               
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
            } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return accounts;
    }

    private static Account createAccount(String[] metadata) {
        String loanid = metadata[0];
        String firstname = metadata[1];
        String middlename = metadata[2];
        String lastname = metadata[3];
        int branch = Integer.parseInt(metadata[4]);
        String gender = metadata[5];
        String DOB = metadata[6];
        int loanamount = Integer.parseInt(metadata[7]);
        String customerphone = metadata[8];
        String passcode = metadata[9];

        // create and return account of this metadata
        return new Account(loanid, firstname, middlename, lastname, branch, gender, DOB, loanamount, customerphone, passcode);
    }

}


class Account {
    private String loanid;
    private String firstname;
    private String middlename;
    private String lastname;
    private int branch;
    private String gender;
    private String DOB;
    private int loanamount;
    private String customerphone;
    private String passcode;

    public Account(String loanid, String firstname, String middlename, String lastname, int branch, String gender, String DOB, int loanamount, String customerphone, String passcode) {
        this.loanid = loanid;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.branch = branch;
        this.gender = gender;
        this.DOB = DOB;
        this.loanamount = loanamount;
        this.customerphone = customerphone;
        this.passcode = passcode;
    }

    public String getloanid() {
        return loanid;
    }

    public void setloanid(String loanid) {
        this.loanid = loanid;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getmiddlename() {
        return middlename;
    }

    public void setmiddlename(String middlename) {
        this.middlename = middlename;
    }
    
    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
    
    public int getbranch() {
        return branch;
    }

    public void setbranch(int branch) {
        this.branch = branch;
    }
    
    public String gender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }
    
    public String DOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.gender = DOB;
    }
    
    public int loanamount() {
        return loanamount;
    }

    public void setloanamount(int loanamount) {
        this.loanamount = loanamount;
    }
    
    public String customerphone() {
        return customerphone;
    }

    public void setcustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }
    
    public String passcode() {
        return passcode;
    }

    public void setpasscode(String passcode) {
        this.passcode = passcode;
    }

    @Override
    public String toString() {
        return "Account [loanid=" + loanid + ", firstname=" + firstname + ", lastname=" + lastname + "]";
        
    }

}