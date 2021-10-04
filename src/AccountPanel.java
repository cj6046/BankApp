import javax.swing.*;
import java.awt.*;

/**
 * This Class holds the card for account actions such as depositing,
 * withdrawing, transferring, etc. It places all GUI components on 
 * this card, but leaves implementation of the associated action
 * listeners to the BankController.
 * 
 * @author Chris Jones
 * @version 3 Oct. 2021
 */
public class AccountPanel {
    // Instance variables
    private JPanel panel;
    private JLabel welcomeLabel;
    private JLabel balanceLabel;
    private JLabel amountLabel;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton logoutButton;
    private Container container;
    private JLabel depositOptionLabel;
    private JTextField depositAmountText;
    private JLabel withdrawOptionLabel;
    private JTextField withdrawAmountText;
    private JButton confirmButton;
    private JButton cancelButton;
    private boolean isDepositOrWithdraw;

    /**
     * Constructor for AccountPanel
     * @param container The Container this panel is added to
     */
    public AccountPanel(Container container) {
        this.container = container;
        this.createPanel();
    }

    /**
     * Method to add all of the components to the panel.
     * This is done with the absolute layout and precise placement.
     */
    public void createPanel() {
        panel = new JPanel(null);

        // Welcome to this page
        welcomeLabel = new JLabel("Welcome to Your Account, ");
        welcomeLabel.setBounds(180, 10, 160, 25);
        panel.add(welcomeLabel);

        // Balance label
        balanceLabel = new JLabel("Balance: ");
        balanceLabel.setBounds(160, 45, 80, 25);
        panel.add(balanceLabel);

        // Amount label to be set with the current balance by the controller
        amountLabel = new JLabel();
        amountLabel.setBounds(280, 45, 80, 25);
        panel.add(amountLabel);

        // Desposit Button
        depositButton = new JButton("Deposit");
        depositButton.setBounds(150, 90, 100, 25);
        panel.add(depositButton);

        // Withdraw Button
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(250, 90, 100, 25);
        panel.add(withdrawButton);

        // Deposit Option
        depositOptionLabel = new JLabel("How much would you like to deposit?");
        depositOptionLabel.setBounds(140, 135, 250, 25);
        panel.add(depositOptionLabel);
        depositOptionLabel.setVisible(false);

        depositAmountText = new JTextField();
        depositAmountText.setBounds(180, 170, 140, 25);
        panel.add(depositAmountText);
        depositAmountText.setVisible(false);

        // Withdraw Option
        withdrawOptionLabel = new JLabel("How much would you like to withdraw?");
        withdrawOptionLabel.setBounds(140, 135, 250, 25);
        panel.add(withdrawOptionLabel);
        withdrawOptionLabel.setVisible(false);

        withdrawAmountText = new JTextField();
        withdrawAmountText.setBounds(180, 170, 140, 25);
        panel.add(withdrawAmountText);
        withdrawAmountText.setVisible(false);

        // Confirm Button
        confirmButton = new JButton("Confirm");
        confirmButton.setBounds(170, 205, 80, 25);
        panel.add(confirmButton);
        confirmButton.setVisible(false);

        // Cancel Button
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(250, 205, 80, 25);
        panel.add(cancelButton);
        cancelButton.setVisible(false);

        // Logout Button
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(210, 450, 80, 25);
        panel.add(logoutButton);

    }

    /**
     * Method to add deposit option GUI to panel
     */
    public void addDepositOption() {
        depositOptionLabel.setVisible(true);
        depositAmountText.setVisible(true);
        confirmButton.setVisible(true);
        cancelButton.setVisible(true);
        isDepositOrWithdraw = true;
    }

    /**
     * Method to add withdraw option GUI to panel
     */
    public void addWithdrawOption() {
        withdrawOptionLabel.setVisible(true);
        withdrawAmountText.setVisible(true);
        confirmButton.setVisible(true);
        cancelButton.setVisible(true);
        isDepositOrWithdraw = false;
    }

    /**
     * Method to remove deposit option GUI from panel
     * and clear the associated text field
     */
    public void removeDepositOption() {
        depositOptionLabel.setVisible(false);
        depositAmountText.setVisible(false);
        confirmButton.setVisible(false);
        cancelButton.setVisible(false);
        this.depositAmountText.setText("");
    }

    /**
     * Method to remove withdraw option GUI from the panel
     * and clear the associated text field
     */
    public void removeWithdrawOption() {
        withdrawOptionLabel.setVisible(false);
        withdrawAmountText.setVisible(false);
        confirmButton.setVisible(false);
        cancelButton.setVisible(false);
        this.withdrawAmountText.setText("");
    }

    /**
     * Method to clear all textfields in panel
     * and remove the deposit or withdrawal options
     */
    public void clearPanel() {
        this.removeDepositOption();
        this.removeWithdrawOption();
    }

    /**
     * GETTERS AND SETTERS ONLY BELOW THIS POINT
     */

    /**
     * Accessor method for the panel
     * @return The instance of the panel with all of the components
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * Accessor method for the container of the panel
     * @return The instance of the container that holds this panel
     */
    public Container getContainer() {
        return container;
    }

    /**
     * Accessor method for the "balance" label
     * @return The instance of the balance label associated with this panel
     */
    public JLabel getBalanceLabel() {
        return balanceLabel;
    }

    /**
     * Accessor method for the welcome label
     * @return The instance of the welcome label associated with this panel
     */
    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    /**
     * Accessor method for the amount label, the label to store the value of the balance variable
     * @return The instance of the amount label associated with this panel
     */
    public JLabel getAmountLabel() {
        return amountLabel;
    }

    /**
     * Accessor method for the deposit button
     * @return The instance of the deposit button associated with this panel
     */
    public JButton getDepositButton() {
        return depositButton;
    }

    /**
     * Accessor method for the withdraw button
     * @return The instance of the withdraw button associated with this panel
     */
    public JButton getWithdrawButton() {
        return withdrawButton;
    }

    /**
     * Accessor method for the logout button
     * @return The instance of the logout button associated with this panel
     */
    public JButton getLogoutButton() {
        return logoutButton;
    }
    
    /**
     * Accessor method for the deposit option label
     * @return The instance of the deposit option label associated with this panel
     */
    public JLabel getDepositOptionLabel() {
        return depositOptionLabel;
    }

    /**
     * Accessor method for the deposit amount textfield
     * @return The instance of the deposit amount textfield associated with this panel
     */
    public JTextField getDepositAmountText() {
        return depositAmountText;
    }

    /**
     * Accessor method for the withdraw option label
     * @return The instance of the withdrawal option label associated with this panel
     */
    public JLabel getWithdrawOptionLabel() {
        return withdrawOptionLabel;
    }

    /**
     * Accessor method for the withdrawal amount textfield
     * @return The instance of the withdrawal amount textfield associated with this panel
     */
    public JTextField getWithdrawAmountText() {
        return withdrawAmountText;
    }

    /**
     * Accessor method for the confirm button
     * @return The instance of the confirm button associated with this panel
     */
    public JButton getConfirmButton() {
        return confirmButton;
    }

    /**
     * Accessor method for the cancel button
     * @return The instance of the cancel button associated with this panel
     */
    public JButton getCancelButton() {
        return cancelButton;
    }

    /**
     * Method that returns whether the deposit or withdraw option is visible.
     * @return True if deposit is visible, false if withdraw is visible
     */
    public boolean isDepositOrWithdraw() {
        return isDepositOrWithdraw;
    }
}
