import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



/**
 * This class is the opening frame of the applet
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
 */
public class Welcome {
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


    public Welcome(Container container) { 
        this.container = container;
        this.createPanel();
    }

    private void createPanel() {

        panel = new JPanel(null);
        
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(500,500));

        welcomeLabel = new JLabel("Welcome to Jones Bank!");
        welcomeLabel.setBounds(180, 10, 160, 25);
        panel.add(welcomeLabel);
        
        userLabel = new JLabel("User ID");
        userLabel.setBounds(150, 45, 60, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(220, 45, 140, 25);
        panel.add(userText);

        passLabel = new JLabel("Password");
        passLabel.setBounds(150, 80, 60, 25);
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(220, 80, 140, 25);
        panel.add(passText);

        loginButton = new JButton("login");
        loginButton.setBounds(205, 130, 80, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Teller t = new Teller();
                t.changeCard(container, "CreateAccount");
                //String testUserID = userText.getText();
                //String testUserPass = String.valueOf(passText.getPassword());

                //Bank.authenticate(testUserID, testUserPass, Bank.findAccount(testUserID))
            }

        });
        panel.add(loginButton);

        createAccountButton = new JButton("Create an account");
        createAccountButton.setBounds(165, 165, 160, 25);
        //createAccountButton.addActionListener(...)
        panel.add(createAccountButton);

        
    } // End of createPanel()

    public JPanel getPanel() {
        return panel;
    }
}
