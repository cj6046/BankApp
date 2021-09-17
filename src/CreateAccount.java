import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This Class is the account creation menu
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
 */
public class CreateAccount {
    //instance variables
    private JPanel panel;
    private JLabel welcomeLabel;
    private JLabel userLabel;
    private JLabel passLabel;
    private JLabel confirmPassLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JPasswordField confirmPassText;
    private JButton createAccountButton;
    private Container container;

    /**
     * Constructor
     * @param container The Container of this Class
     */
    public CreateAccount(Container container) {
        this.container = container;
        this.createPanel();
    }

    /**
     * Method to create a JPanel with all of the components this page needs
     */
    public void createPanel() {
        // Instantiates JPanel to be added to
        panel = new JPanel(null);

        // Welcome to this page
        welcomeLabel = new JLabel("Create an Account Here!");
        welcomeLabel.setBounds(190, 10, 165, 25);
        panel.add(welcomeLabel);

        // Enter a new username
        userLabel = new JLabel("Enter a new username: ");
        userLabel.setBounds(70, 45, 165, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(220, 45, 140, 25);
        panel.add(userText);

        // Enter a new password
        passLabel = new JLabel("Enter a new password");
        passLabel.setBounds(70, 80, 165, 25);
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(220, 80, 140, 25);
        panel.add(passText);

        // Confirm new password
        confirmPassLabel = new JLabel("Confirm your password: ");
        confirmPassLabel.setBounds(70, 115, 165, 25);
        panel.add(confirmPassLabel);

        confirmPassText = new JPasswordField();
        confirmPassText.setBounds(220, 115, 140, 25);
        panel.add(confirmPassText);

        // Create the Account Button
        createAccountButton = new JButton("Create Your New Account");
        createAccountButton.setBounds(150, 150, 200, 25);
        createAccountButton.setFocusable(false);
        createAccountButton.addActionListener(new ActionListener() {
            /**
             * Method to create a new Account with the provided data
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Teller t = new Teller();
                t.changeCard(container, "AccountPanel");
            }

        });
        panel.add(createAccountButton);

        // Back button
        JButton backButton = new JButton("Back to Home");
        backButton.setBounds(190, 450, 120, 25);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Teller t = new Teller();
                t.changeCard(container, "Welcome");
            }
        });
        panel.add(backButton);
    }

    /**
     * Getter method for the JPanel of this Class
     * @return The JPanel with the components
     */
    public JPanel getPanel() {
        return panel;
    }
}
