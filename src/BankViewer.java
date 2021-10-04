/**
 * This class functions as the main View in the MVC model. It uses a card layout to attach 
 * other GUI panes into the view and send data to and receive data from the controller.
 * 
 * @author Chris Jones
 * @version 3 Oct. 2021
 */

import java.awt.*;
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
        this.createAndShowGUI();
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

        // Add cards to the panel and assign names to be used
        containerPanel.add(welcomePanel.getPanel(), "Welcome");
        containerPanel.add(createAccountPanel.getPanel(), "CreateAccount");
        containerPanel.add(accountPanel.getPanel(), "AccountPanel");

        // Add panel to Container
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
     * Method to insantiate components
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

    /**
     * Accessor method for the panel that holds all the others
     * @return The instance of the panel with all of the components
     */
    public JPanel getPanel() {
        return containerPanel;
    }

    /**
     * Accessor method for the WelcomePanel
     * @return The instance of the WelcomePanel associated with this viewer
     */
    public WelcomePanel getWelcomePanel() {
        return welcomePanel;
    }

    /**
     * Accessor method for the CreateAccountPanel
     * @return The instance of the CreateAccountPanel associated with this viewer
     */
    public CreateAccountPanel getCreateAccountPanel() {
        return createAccountPanel;
    }

    /**
     * Accessor method for the AccountPanel
     * @return The instance of the AccountPanel associated with this viewer
     */
    public AccountPanel getAccountPanel() {
        return accountPanel;
    }
} // End of BankViewer Class
