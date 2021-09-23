
/**
 * This is the driver class for the Bank applet
 * 
 * @author Chris Jones
 * @version 17 Sept. 2021
 */
public class BankController {

    //Instance variables
    private BankModel model;
    private BankViewer view;

    private String username;
    //private String password;

    public BankController(BankModel model, BankViewer view) {
        this.model = model;
        this.view = view;
        view.createAndShowGUI();
    }

    /**
     * Method to initialize the controller
     * and add action listeners to buttons on all panels
     */
    public void initController() {
        // WelcomePanel
        view.getWelcomePanel().getLoginButton().addActionListener(
            (e) -> {
                // store username
                this.username = view.getWelcomePanel().getUserText().getText();
                // set balance label on account panel
                view.getAccountPanel().getAmountLabel().setText(
                    String.valueOf(model.getAccountModel(model.findAccount(this.username)).getBalance())
                );
                // change to account panel
                view.changeCard(view.getWelcomePanel().getContainer(), "AccountPanel");
            });

        view.getWelcomePanel().getCreateAccountButton().addActionListener(
            (e) -> view.changeCard(view.getWelcomePanel().getContainer(), "CreateAccount")
        );

        // CreateAccountPanel
        view.getCreateAccountPanel().getBackButton().addActionListener(
            (e) -> {
                view.getCreateAccountPanel().getUserText().setText("");
                view.getCreateAccountPanel().getPassText().setText("");
                view.getCreateAccountPanel().getConfirmPassText().setText("");
                view.changeCard(view.getCreateAccountPanel().getContainer(), "Welcome");
            });

        view.getCreateAccountPanel().getCreateAccountButton().addActionListener(
            (e) -> {
                // TODO implement input validation for matching passwords
                // Store user input
                String createUsername = view.getCreateAccountPanel().getUserText().getText();
                char[] passArray = view.getCreateAccountPanel().getPassText().getPassword();
                String createPassword = String.valueOf(passArray);
                // create a new Account object with user input
                model.addAccount(new AccountModel(createUsername, createPassword, 0));
                // Clear fields
                view.getCreateAccountPanel().clearPanel();
            });

        // AccountPanel
        view.getAccountPanel().getLogoutButton().addActionListener(
            (e) -> view.changeCard(view.getAccountPanel().getContainer(), "Welcome")
        );

        view.getAccountPanel().getDepositButton().addActionListener(
            (e) -> {
                view.getAccountPanel().removeWithdrawOption();
                view.getAccountPanel().addDepositOption();
            });
        
        view.getAccountPanel().getWithdrawButton().addActionListener(
            (e) -> {
                view.getAccountPanel().removeDepositOption();
                view.getAccountPanel().addWithdrawOption();
            });

        view.getAccountPanel().getCancelButton().addActionListener(
            (e) -> {
                view.getAccountPanel().removeDepositOption();
                view.getAccountPanel().removeWithdrawOption();
            });

        view.getAccountPanel().getConfirmButton().addActionListener(
            (e) -> {
                if(view.getAccountPanel().getDepositOrWithdraw()) {
                    // account.deposit
                } else {
                    // account.withdraw
                }
            });
    } // End of initController
}
