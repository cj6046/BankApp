import javax.swing.*;
import java.awt.*;

/**
 * This Class holds the card for the home login screen, welcoming the
 * user to the app. It places all GUI components on 
 * this card, but leaves implementation of the associated action
 * listeners to the BankController.
 * 
 * @author Chris Jones
 * @version 3 Oct. 2021
 */
public class WelcomePanel {
    // Instance variables
    private JLabel welcomeLabel;
    private JLabel userLabel;
    private JLabel passLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;
    private JButton createAccountButton;
    private JPanel panel;
    private Container container;

    /**
     * Constructor to create a WelcomePanel
     * @param container The Container the WelcomePanel is added to
     */
    public WelcomePanel(Container container) { 
        this.container = container;
        this.createPanel();
    }

    /**
     * Method to instantiate the WelcomePanel JPanel
     * and add all of the components to the WelcomePanel
     */
    private void createPanel() {
        // Insantiates panel with AbsoluteLayout
        panel = new JPanel(null);
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(500,500));
        // Title label
        welcomeLabel = new JLabel("Welcome to Jones Bank!");
        welcomeLabel.setBounds(180, 10, 160, 25);
        panel.add(welcomeLabel);
        // Username label
        userLabel = new JLabel("User ID");
        userLabel.setBounds(150, 45, 60, 25);
        panel.add(userLabel);
        // Username textfield
        userText = new JTextField();
        userText.setBounds(220, 45, 140, 25);
        panel.add(userText);
        // Password label
        passLabel = new JLabel("Password");
        passLabel.setBounds(150, 80, 60, 25);
        panel.add(passLabel);
        // Password textfield
        passText = new JPasswordField();
        passText.setBounds(220, 80, 140, 25);
        panel.add(passText);
        // Login button
        loginButton = new JButton("login");
        loginButton.setBounds(205, 130, 80, 25);
        loginButton.setFocusable(false);
        panel.add(loginButton);
        // Create account button
        createAccountButton = new JButton("Create an account");
        createAccountButton.setBounds(165, 165, 160, 25);
        panel.add(createAccountButton);  
    } // End of createPanel()

    /**
     * Method to clear all text fields on panel
     */
    public void clearPanel() {
        this.userText.setText("");
        this.passText.setText("");
    }

    /**
     * ONLY GETTERS AND SETTERS BELOW THIS POINT
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
     * Accessor method for the welcome label
     * @return The instance of the welcome label associated with this panel
     */
    public JLabel getWelcomeLabel() {
        return welcomeLabel;
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
     * Accessor method for the login button
     * @return The instance of the login button associated with this panel
     */
    public JButton getLoginButton() {
        return loginButton;
    }

    /**
     * Accessor method for the account creation button
     * @return The instance of the account creation button associated with this panel
     */
    public JButton getCreateAccountButton() {
        return createAccountButton;
    }

}
