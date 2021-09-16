import javax.swing.*;
import java.awt.event.*;

/**
 * This Class is the account creation menu
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
 */
public class CreateAccount extends JFrame {
    //instance variables
    private JPanel panel;
    private JLabel username;
    private JLabel password;
    private JTextField userText;
    private JPasswordField passText;

    public CreateAccount() {
        super("Jones Bank: Account Creation");
        this.setSize(350, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
}
