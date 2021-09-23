import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This Class holds the card for account actions such as depositing,
 * withdrawing, transferring, etc.
 * 
 * @author Chris Jones
 * @version 17 Sept. 2021
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
     * Method to add all of the components to the panel
     */
    public void createPanel() {
        panel = new JPanel(null);

        // Welcome to this page
        welcomeLabel = new JLabel("Welcome to Your Account, ");
        welcomeLabel.setBounds(180, 10, 160, 25);
        panel.add(welcomeLabel);

        // Display balance
        balanceLabel = new JLabel("Balance: ");
        balanceLabel.setBounds(160, 45, 80, 25);
        panel.add(balanceLabel);

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
     * Method to remove deposit option GUI to panel
     */
    public void removeDepositOption() {
        depositOptionLabel.setVisible(false);
        depositAmountText.setVisible(false);
        confirmButton.setVisible(false);
        cancelButton.setVisible(false);
    }

    /**
     * Method to remove withdraw option GUI to panel
     */
    public void removeWithdrawOption() {
        withdrawOptionLabel.setVisible(false);
        withdrawAmountText.setVisible(false);
        confirmButton.setVisible(false);
        cancelButton.setVisible(false);
    }

    /**
     * GETTERS AND SETTERS ONLY BELOW THIS POINT
     */
    public JPanel getPanel() {
        return panel;
    }
    public JLabel getBalanceLabel() {
        return balanceLabel;
    }
    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }
    public JLabel getAmountLabel() {
        return amountLabel;
    }
    public JButton getDepositButton() {
        return depositButton;
    }
    public JButton getWithdrawButton() {
        return withdrawButton;
    }
    public JButton getLogoutButton() {
        return logoutButton;
    }
    public Container getContainer() {
        return container;
    }
    public JLabel getDepositOptionLabel() {
        return depositOptionLabel;
    }
    public JTextField getDepositAmountText() {
        return depositAmountText;
    }
    public JLabel getWithdrawOptionLabel() {
        return withdrawOptionLabel;
    }
    public JTextField getWithdrawAmountText() {
        return withdrawAmountText;
    }
    public JButton getConfirmButton() {
        return confirmButton;
    }
    public JButton getCancelButton() {
        return cancelButton;
    }
    public boolean getDepositOrWithdraw() {
        return isDepositOrWithdraw;
    }
}
