import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This Class holds the card for account actions such as depositing,
 * withdrawing, transferring, etc.
 * 
 * @author Chris Jones
 * @version 17 Sept. 2021
 */
public class AccountPanel {
    // Instance variables
    private JPanel panel;
    private Container container;


    public AccountPanel(Container container) {
        this.container = container;
        this.createPanel();
    }

    public void createPanel() {
        
    }

    public JPanel getPanel() {
        return panel;
    }
    
}
