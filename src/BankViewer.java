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

public class BankViewer {

    //Instance variables
    private JPanel containerPanel;
    private WelcomePanel welcomePanel;
    private CreateAccountPanel createAccountPanel;
    private AccountPanel accountPanel;

    /**
     * Constructor for BankViewer
     */
    public BankViewer() {

    }

    /**
     * Method to add all of the different "cards" together on one panel
     *
     * @param mFrameContainer The Container object the cards are added to
     */
    public void addContentToPane(Container mFrameContainer) {
        // Instantiate the containerPanel to hold cards
        containerPanel = new JPanel(new CardLayout());

        // Instantiate cards to be added
        welcomePanel = new WelcomePanel(containerPanel);
        createAccountPanel = new CreateAccountPanel(containerPanel);
        accountPanel = new AccountPanel(containerPanel);

        // Add cards to the panel
        containerPanel.add(welcomePanel.getPanel(), "Welcome");
        containerPanel.add(createAccountPanel.getPanel(), "CreateAccount");
        containerPanel.add(accountPanel.getPanel(), "AccountPanel");

        // Add panel to Container param
        mFrameContainer.add(containerPanel, BorderLayout.CENTER);
    }

    /**
     * Method to change which page is currently being viewed
     * 
     * @param container The Container from the card
     * @param cardName The name of the card to be switched to
     */
    public void changeCard(Container container, String cardName) {
        CardLayout cl = (CardLayout)(container.getLayout());
        cl.show(container, cardName);
    }

    /**
     * Method to insantiate compnents
     *      and make GUI viewable
     */
    public void createAndShowGUI() {
        // Instantiate the Frame
        JFrame mFrame = new JFrame("Jones Bank");
        mFrame.setSize(500, 500);
        mFrame.setResizable(false);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setLocationRelativeTo(null);

        // Create and setup the content pane
        this.addContentToPane(mFrame.getContentPane());

        // Display the window
        mFrame.pack();
        mFrame.setVisible(true);
    }

    /**
     * ONLY GETTERS AND SETTERS BELOW THIS POINT
     */
    public JPanel getPanel() {
        return containerPanel;
    }

    public WelcomePanel getWelcomePanel() {
        return welcomePanel;
    }

    public CreateAccountPanel getCreateAccountPanel() {
        return createAccountPanel;
    }

    public AccountPanel getAccountPanel() {
        return accountPanel;
    }

} // End of BankViewer Class
