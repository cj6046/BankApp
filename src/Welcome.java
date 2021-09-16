import javax.swing.*;
import java.awt.event.*;

/**
 * This class is the opening frame of the applet
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
 */
public class Welcome extends JFrame {
    // Instance variables
    private JPanel panel;
    private JLabel welcomeLabel;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JPasswordField passText;
    private JButton loginButton;
    private JButton createAccountButton;


    public Welcome() {
        // Attempt at GUI
        super("Jones Bank");
        this.setSize(350, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        this.add(panel);
        panel.setLayout(null);

        welcomeLabel = new JLabel("Welcome to Jones Bank!");
        welcomeLabel.setBounds(100, 10, 150, 25);
        panel.add(welcomeLabel);

        userLabel = new JLabel("User ID");
        userLabel.setBounds(10, 40, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 40, 165, 25);
        panel.add(userText);

        passLabel = new JLabel("Password");
        passLabel.setBounds(10, 85, 80, 25);
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(100, 85, 165, 25);
        panel.add(passText);

        loginButton = new JButton("login");
        loginButton.setBounds(140, 130, 80, 25);
        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String testUserID = userText.getText();
                String testUserPass = String.valueOf(passText.getPassword());

                //Bank.authenticate(testUserID, testUserPass, Bank.findAccount(testUserID))
            }

        });
        panel.add(loginButton);

        createAccountButton = new JButton("Create an account");
        createAccountButton.setBounds(100, 170, 165, 25);

        panel.add(createAccountButton);
    } // End of constructor
}
