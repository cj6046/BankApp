/**
 * This will be the user-facing class that allows the user to interact with
 * the Bank and Account classes.
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
 */
import java.util.Scanner;
import javax.swing.*;

public class Teller {
    
    public static void main(String[] args) {
        // Attempt at GUI
        JFrame frame = new JFrame("Jones Bank");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User ID");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10, 65, 80, 25);
        panel.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 65, 165, 25);
        panel.add(passText);

        JButton login = new JButton("Login");
        login.setBounds(140, 110, 80, 25);
        panel.add(login);

/*
        // Will first welcome user to bank
        System.out.println("Welcome to Jones Bank!"
                            + "\nPlease choose an option: "
                            + "\n1) Login"
                            + "\n2) Create Account"
                            + "\n3) Close program.");
        
        Scanner in = new Scanner(System.in);
        boolean done = false;

        while(!done) {
            // Then will sit at a menu
            // 1) Login to account
            // 2) Create account
            int choice = in.nextInt();
            switch(choice) {
                case 1 : 
                    // login will prompt them for a user ID associated with Account
                    System.out.println("You chose login.");
                    break;
                case 2 :
                    // create will ask them for a new user ID and create an Account
                    System.out.println("You chose create account.");
                    break;
                case 3 :
                    done = true;
                    break;
            }

            // Once in account, they sit at another menu
                // 1) Check balance
                // 2) Deposit
                // 3) Withdraw
                // 4) Transfer
                // 5) Exit

        } // End of while(!done)

        in.close(); */

    } // End of main()
} // End of Teller Class
