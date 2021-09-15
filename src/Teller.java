/**
 * This will be the user-facing class that allows the user to interact with
 * the Bank and Account classes.
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
 */
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class Teller extends JFrame implements ActionListener {

    // Instance variables
    private JPanel panel;
    private JLabel welcomeLabel;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JPasswordField passText;
    private JButton login;
    private JButton create;


    public Teller() {
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

        login = new JButton("Login");
        login.setBounds(140, 130, 80, 25);
        panel.add(login);

        create = new JButton("Create an account");
        create.setBounds(100, 170, 165, 25);
        panel.add(create);
    } // End of constructor

    public static void main(String[] args) {
        Teller teller = new Teller();
        teller.setVisible(true);
    } // End of main

    @Override
    public void actionPerformed(ActionEvent e) {
        String testUserID = userText.getText();
        String testUserPass = passText.getText();
        
        //Bank.authenticate(testUserID, testUserPass, Bank.findAccount(testUserID))

    } // End of actionPerformed()
} // End of Teller Class
