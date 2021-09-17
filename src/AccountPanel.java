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
    private JButton logoutButton;
    private Container container;
    private Bank bank;


    public AccountPanel(Container container, Bank bank) {
        this.bank = bank;
        this.container = container;
        this.createPanel();
    }

    public void createPanel() {
        panel = new JPanel(null);

        // Welcome to this page
        welcomeLabel = new JLabel("Welcome to Your Account, ");
        welcomeLabel.setBounds(180, 10, 160, 25);
        panel.add(welcomeLabel);

        // Logout Button
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(210, 450, 80, 25);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Teller t = new Teller();
                t.changeCard(container, "Welcome");
            }
        });
        panel.add(logoutButton);
    }

    public JPanel getPanel() {
        return panel;
    }
    
}
