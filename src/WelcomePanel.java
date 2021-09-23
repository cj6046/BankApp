import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



/**
 * This class is the opening frame of the applet
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
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
     * @param container The Container the WelcomePanel is on
     */
    public WelcomePanel(Container container) { 
        this.container = container;
        this.createPanel();
    }

    /**
     * Method to add all of the components to the WelcomePanel
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
    public JPanel getPanel() {
        return panel;
    }
    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }
    public JLabel getUserLabel() {
        return userLabel;
    }
    public JLabel getPassLabel() {
        return passLabel;
    }
    public JTextField getUserText() {
        return userText;
    }
    public JPasswordField getPassText() {
        return passText;
    }
    public JButton getLoginButton() {
        return loginButton;
    }
    public JButton getCreateAccountButton() {
        return createAccountButton;
    }
    public Container getContainer() {
        return container;
    }
}
