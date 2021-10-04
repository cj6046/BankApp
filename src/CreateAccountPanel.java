import javax.swing.*;
import java.awt.*;

/**
 * This Class holds the card for creating an account, inlcuding two text fields
 * for the password and password confirmation. It places all GUI components on 
 * this card, but leaves implementation of the associated action
 * listeners to the BankController.
 * 
 * @author Chris Jones
 * @version 3 Oct. 2021
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
     * Constructor for CreateAccountPanel
     * @param container The Container this panel is added to
     */
    public CreateAccountPanel(Container container) {
        this.container = container;
        this.createPanel();
    }

    /**
     * Method to instantiate the CreateAccountPanel JPanel
     * and add all of the components to the CreateAccountPanel
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
     * Accessor method for the title label
     * @return The instance of the title label associated with this panel
     */
    public JLabel gettitleLabel() {
        return titleLabel;
    }

    /**
     * Accessor method for the username label
     * @return The instance of the usernmae label associated with this panel
     */
    public JLabel getUserLabel() {
        return userLabel;
    }

    /**
     * Accessor method for the password label
     * @return The instance of the password label associated with this panel
     */
    public JLabel getPassLabel() {
        return passLabel;
    }

    /**
     * Accessor method for the password confirmation label
     * @return The instance of the password confirmation label associated with this panel
     */
    public JLabel getConfirmPassLabel() {
        return confirmPassLabel;
    }

    /**
     * Accessor method for the username textfield
     * @return The instance of the username textfield associated with this panel
     */
    public JTextField getUserText() {
        return userText;
    }

    /**
     * Accessor method for the password passwordfield
     * @return The instance of the password passwordfield associated with this panel
     */
    public JPasswordField getPassText() {
        return passText;
    }

    /**
     * Accessor method for the password confirmation textfield
     * @return The instance of the password confirmation textfield associated with this panel
     */
    public JPasswordField getConfirmPassText() {
        return confirmPassText;
    }

    /**
     * Accessor method for the account creation button
     * @return The instance of the account creation button associated with this panel
     */
    public JButton getCreateAccountButton() {
        return createAccountButton;
    }

    /**
     * Accessor method for the back button
     * @return The instance of the back button associated with this panel
     */
    public JButton getBackButton() {
        return backButton;
    }
}
