import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This Class is the account creation menu
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
 */
public class CreateAccountPanel {
    //instance variables
    private JPanel panel;
    private JLabel titleLabel;
    private JLabel userLabel;
    private JLabel passLabel;
    private JLabel confirmPassLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JPasswordField confirmPassText;
    private JButton createAccountButton;
    private JButton backButton;
    private Container container;

    /**
     * Constructor
     * @param container The Container of this Class
     */
    public CreateAccountPanel(Container container) {
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
        titleLabel = new JLabel("Create an Account Here!");
        titleLabel.setBounds(190, 10, 165, 25);
        panel.add(titleLabel);

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
        panel.add(createAccountButton);

        // Back button
        backButton = new JButton("Back to Home");
        backButton.setBounds(190, 450, 120, 25);
        panel.add(backButton);
    }

    /**
     * Method to clear all of the text fields in the Panel
     */
    public void clearPanel() {
        this.userText.setText("");
        this.passText.setText("");
        this.confirmPassText.setText("");
    }

    /**
     * ONLY GETTERS AND SETTERS BELOW
     */
    public JPanel getPanel() {
        return panel;
    }

    public JLabel gettitleLabel() {
        return titleLabel;
    }
    public JLabel getUserLabel() {
        return userLabel;
    }
    public JLabel getPassLabel() {
        return passLabel;
    }
    public JLabel getConfirmPassLabel() {
        return confirmPassLabel;
    }
    public JTextField getUserText() {
        return userText;
    }
    public JPasswordField getPassText() {
        return passText;
    }
    public JPasswordField getConfirmPassText() {
        return confirmPassText;
    }
    public JButton getCreateAccountButton() {
        return createAccountButton;
    }
    public JButton getBackButton() {
        return backButton;
    }
    public Container getContainer() {
        return container;
    }
}
