/**
 * This is the storage class for Account information
 */
public class Account {
    //Instance variables
    private String accountHolder;
    private String password;
    private double balance;

    //Constructor
    public Account(String accountHolder, String password, double balance) {
        this.accountHolder = accountHolder;
        this.password = password;
        this.balance = balance;
    }

    //Parameterless constructor
    public Account() {
        this("", "0000", 0.0);
    }

    /**
     * Getter for accountHolder to return name
     * @return The name of the account holder
     */
    public String getName() {
        return accountHolder;
    }

    /**
     * Setter for accountHolder to assign name
     * @param nameInput The name given by user
     */
    public void setName(String nameInput) {
        this.accountHolder = nameInput;
    }

    /**
     * Getter method for password
     * @return The password of the Account
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for balance
     * @return The current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * This deposits money into the Account, increasing the balance
     * @param depositAmt The amount to be deposited into the account
     */
    public void deposit(double depositAmt) {
        this.balance += depositAmt;
    }

    /**
     * This withdraws money from the Account, decreasing the balance
     * @param withdrawAmt The amount to be withdrawn
     */
    public void withdraw(double withdrawAmt) {
        if (withdrawAmt < balance) {
            this.balance -= withdrawAmt;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    /**
     * Method to convert Account contents into a formatted String
     */
    @Override
    public String toString() {
        return ("The name associated with the account is: " + accountHolder 
                + "\n Your current balance is: " + balance);
    }
}
