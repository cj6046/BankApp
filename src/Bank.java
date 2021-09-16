import java.util.ArrayList;

/**
 * This Class creates an ArrayList of Accounts
 * and handles accessing those Accounts
 * 
 * @author Christopher Jones
 * @version 15 Sept. 2021
 */
public class Bank {

    private ArrayList<Account> accounts;

    /**
     * Constructor to initialize ArrayList
     */
    public Bank() {
        accounts = new ArrayList<Account>();
    }

    /**
     * Method to add an Account to the list
     */
    public void addAccount() {
        accounts.add(new Account());
    }

    /**
     * Method to return an Account's position in the ArrayList
     */
    public int findAccount(String accountID) {
        int accPos = 0;
        for (Account a : accounts) {
            if (a.getName().equals(accountID)) {
                accPos = accounts.indexOf(a);
            }
        }
        return accPos;
    }

    /**
     * Method to authenticate the provided information with the provided Account
     * 
     * @param testUserID The ID provided by the user
     * @param testUserPass The password provided by the user
     * @param account The account found using the testUserID
     * @return
     */
    public boolean authenticate(String testUserID, String testUserPass, Account account) {
        boolean authenticated = false;
        return authenticated;
    }
}
