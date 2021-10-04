import java.util.ArrayList;

/**
 * This Class models a bank by creating a collection of Accounts,
 * searching through that collection, and autheniticating access.
 * 
 * @author Christopher Jones
 * @version 3 Oct. 2021
 */
public class BankModel {
    // Define the collection
    private ArrayList<AccountModel> accounts;

    /**
     * Constructor to initialize ArrayList
     */
    public BankModel() {
        accounts = new ArrayList<AccountModel>();

        // Master account inbedded into system for easy access to test features.
        accounts.add(new AccountModel("c", "123", 500));
    }

    /**
     * Method to add an Account to the list
     * @param newAccount an Account object to be added to the collection
     */
    public void addAccount(AccountModel newAccount) {
        accounts.add(newAccount);
    }

    /**
     * Method to get a particular account from the collection
     * @param pos The position of the Account in the arraylist
     * @return The Account at the specified position
     */
    public AccountModel getAccountModel(int pos) {
        return accounts.get(pos);
    }

    /**
     * Method to return an Account's position in the collection
     * it will assume Account does not exist until found and can cause out of bounds exceptions.
     * this method does a simple linear search (not efficient for large collections!)
     * @param the account holder's ID for the account
     */
    public int findAccount(String accountID) {
        // Assumes account does not exist until found
        int accPos = -1;
        for (AccountModel a : accounts) {
            if (a.getName().equals(accountID)) {
                accPos = accounts.indexOf(a);
            }
        }
        return accPos;
    }

    /**
     * Method to authenticate the provided information belongs to an Account in the collection
     * and matches one another
     * VERY simple, does not provide secure password transference
     * 
     * @param testUserID The ID provided by the user
     * @param testUserPass The password provided by the user
     * @return whether the inputs are valid
     */
    public boolean authenticate(String testUserID, String testUserPass) {
        boolean authenticated = false;
        // First, ensure the ID is associated with an Account in the collection
        if (findAccount(testUserID) >= 0) {
            // Then, ensure ID matches the associate password
            if (accounts.get(findAccount(testUserID)).getPassword().equals(testUserPass) ) {
                authenticated = true;
            }
        }
        return authenticated;
    }
}
