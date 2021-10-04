/**
 * This class models the behavior of a bank account. Although it has a password
 * associated with each instance, there are no attempts made to secure it.
 * 
 * @author Chris Jones
 * @version 3 Oct. 2021 
 */

public class AccountModel {
    //Instance variables
    private String accountID;
    private String password;
    private double balance;

    //Constructor
    public AccountModel(String accountID, String password, double balance) {
        this.accountID = accountID;
        this.password = password;
        this.balance = balance;
    }

    //Parameterless constructor
    public AccountModel() {
        this("", "0000", 0.0);
    }

    /**
     * Accessor method for the accountID variable
     * @return The accountID of this instance of Account
     */
    public String getName() {
        return accountID;
    }

    /**
     * Modifier method to change the accountID variable
     * @param nameInput The new accountID to be associated with this instance of Account
     */
    public void setName(String nameInput) {
        this.accountID = nameInput;
    }

    /**
     * Accessor method for the password variable
     * This is not done in a secure way, passwords are public and freely shared between classes
     * @return The password associated with this account
     */
    public String getPassword() {
        return password;
    }

    /**
     * Modifier method to change the password variable
     * This is not done in a secure way, passwords are public and freely shared between classes
     * @param password The new password to be associated with this instance of Account
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Accessor method for the balance variable
     * @return The current balance associated with this account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * This deposits money into the Account, increasing the balance.
     * You cannot deposit a negative amount
     * @param depositAmt The amount to be deposited into the account
     */
    public void deposit(double depositAmt) {
        // Input validation for the deposit amount
        if (depositAmt > 0) {
            this.balance += depositAmt;
        } else {
            // TODO find a way to turn this into a JOptionPane or something presented to user
            // Maybe use a new custome exception?
            System.out.println("You cannot deposit a negative amount. Please withdraw.");
        }
    }

    /**
     * This withdraws money from the Account, decreasing the balance
     * You cannot withdraw more than the current balance or a negative amount
     * @param withdrawAmt The amount to be withdrawn
     */
    public void withdraw(double withdrawAmt) {
        // Input validation for withdrawal amount
        if (withdrawAmt <= balance && withdrawAmt > 0) {
            this.balance -= withdrawAmt;
        } else {
            // TODO find a way to turn this into a JOptionPane or something presented to user
            // Maybe use a new custome exception?
            System.out.println("Insufficient funds.");
        }
    }

    /**
     * Method to convert Account contents into a formatted String
     */
    @Override
    public String toString() {
        return ("The name associated with the account is: " + this.accountID 
                + "\n Your current balance is: " + this.balance);
    }
}
