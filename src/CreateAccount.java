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

        welcomeLabel = new JLabel("Create an Account Here!");
        welcomeLabel.setBounds(190, 10, 165, 25);
        panel.add(welcomeLabel);

        JButton createAccountButton = new JButton("Back to Home");
        createAccountButton.setBounds(190, 450, 120, 25);
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
