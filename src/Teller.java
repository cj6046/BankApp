/**
 * This will be the user-facing class that allows the user to interact with
 * the Bank and Account classes.
 * 
 * @author Chris Jones
 * @version 15 Sept. 2021
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teller {

    //Instance variables
    private JPanel containerPanel;

    /**
     * Method to add all of the different "cards" together on one panel
     *
     * @param mFrameContainer The Container object the cards are added to
     */
    public void addContentToPane(Container mFrameContainer) {
        // Instantiate the containerPanel to hold cards
        containerPanel = new JPanel(new CardLayout());

        // Instantiate cards to be added
        Welcome welcomePanel = new Welcome(containerPanel);
        CreateAccount createAccountPanel = new CreateAccount(containerPanel);

        // Add cards to the panel
        containerPanel.add(welcomePanel.getPanel(), "Welcome");
        containerPanel.add(createAccountPanel.getPanel(), "CreateAccount");

        // Add panel to Container param
        mFrameContainer.add(containerPanel, BorderLayout.CENTER);
    }

    public void changeCard(Container container, String cardName) {
        CardLayout cl = (CardLayout)(container.getLayout());
        cl.show(container, cardName);
    }

    private static void createAndShowGUI() {
        // Instantiate the Frame
        JFrame mFrame = new JFrame("Jones Bank");
        mFrame.setSize(500, 500);
        mFrame.setResizable(false);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setLocationRelativeTo(null);

        // Create and setup the content pane
        Teller teller = new Teller();
        teller.addContentToPane(mFrame.getContentPane());

        // Display the window
        mFrame.pack();
        mFrame.setVisible(true);
    }


    public static void main(String[] args) {
        createAndShowGUI();
    } // End of main
} // End of Teller Class
