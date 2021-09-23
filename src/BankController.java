
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

    public BankController(BankModel model, BankViewer view) {
        this.model = model;
        this.view = view;
        this.initView();
    }

    public void initView() {
        view.createAndShowGUI();
    }

    public void initController() {
        // WelcomePanel
        view.getWelcomePanel().getLoginButton().addActionListener(
            (e) -> view.changeCard(view.getWelcomePanel().getContainer(), "AccountPanel")
        );

        view.getWelcomePanel().getCreateAccountButton().addActionListener(
            (e) -> view.changeCard(view.getWelcomePanel().getContainer(), "CreateAccount")
        );

        // CreateAccountPanel
        view.getCreateAccountPanel().getBackButton().addActionListener(
            (e) -> view.changeCard(view.getCreateAccountPanel().getContainer(), "Welcome")
        );

        view.getCreateAccountPanel().getCreateAccountButton().addActionListener(
            (e) -> {
                // TODO implement input validation for matching passwords
                // Store user input
                String username = view.getCreateAccountPanel().getUserText().getText();
                char[] passArray = view.getCreateAccountPanel().getPassText().getPassword();
                String password = String.valueOf(passArray);
                // create a new Account object with user input
                model.addAccount(new AccountModel(username, password, 0));
            }
        );

        // AccountPanel
        view.getAccountPanel().getLogoutButton().addActionListener(
            (e) -> view.changeCard(view.getAccountPanel().getContainer(), "Welcome")
        );
    }
}
