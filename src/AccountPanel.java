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

        // Logout Button
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(210, 450, 80, 25);
/*
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankViewer t = new BankViewer();
                t.changeCard(container, "Welcome");
            }
        });
*/
        panel.add(logoutButton);
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
}
