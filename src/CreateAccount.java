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
    private JLabel username;
    private JLabel password;
    private JLabel confirmPass;
    private JTextField userText;
    private JPasswordField passText;
    private JPasswordField confirmPassText;

    private Container container;

    public CreateAccount(Container container) {
        this.container = container;
        this.createPanel();
    }

    public void createPanel() {
        panel = new JPanel(null);

        username = new JLabel("Create an Account Here!");
        username.setBounds(160, 10, 165, 25);
        panel.add(username);

        JButton createAccountButton = new JButton("Create Your Account");
        createAccountButton.setBounds(100, 45, 65, 25);
        createAccountButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Teller t = new Teller();
                t.changeCard(container, "Welcome");
            }

        });
        panel.add(createAccountButton);
    }

    public JPanel getPanel() {
        return panel;
    }
}
