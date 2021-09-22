/**
 * This will be the driver class for the Bank app
 * 
 * @author Chris Jones
 * @version 18 Sept. 2021
 */

public class BankMain {

    /**
     * This is the main method that runs to start the Bank app
     * 
     * @param args Arguments sent to main()
     */
    public static void main(String[] args) {
        BankModel model = new BankModel();
        BankViewer view = new BankViewer();
        BankController controller = new BankController(model, view);
        controller.initController();
    }
}