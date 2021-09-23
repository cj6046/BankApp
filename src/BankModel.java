import java.util.ArrayList;

/**
 * This Class creates an ArrayList of Accounts
 * and handles accessing those Accounts
 * 
 * @author Christopher Jones
 * @version 15 Sept. 2021
 */
public class BankModel {

    private ArrayList<AccountModel> accounts;

    /**
     * Constructor to initialize ArrayList
     */
    public BankModel() {
        accounts = new ArrayList<AccountModel>();
        accounts.add(new AccountModel("c", "123", 500));
    }

    /**
     * Method to add an Account to the list
     */
    public void addAccount(AccountModel newAccount) {
        accounts.add(newAccount);
    }

    /**
     * Method to get a particular account
     * @param pos The position of the Account in the arraylist
     * @return The Account at the specified position
     */
    public AccountModel getAccountModel(int pos) {
        return accounts.get(pos);
    }

    /**
     * Method to return an Account's position in the ArrayList
     */
    public int findAccount(String accountID) {
        int accPos = 0;
        for (AccountModel a : accounts) {
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
    public boolean authenticate(String testUserID, String testUserPass, AccountModel account) {
        boolean authenticated = false;
        return authenticated;
    }
}
