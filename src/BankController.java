/**
 * This class controls all communication between the viewer GUI modules
 * and the Bank and Account model modules from the bank applet. 
 * 
 * @author Chris Jones
 * @version 3 Oct. 2021
 */
public class BankController {

    //Instance variables
    private BankModel model;
    private BankViewer view;
    private String username;
    private String password;

    /**
     * Constructor for the BankCotnroller
     * @param model The BankModel this class controls
     * @param view The BankViewer this class displays to
     */
    public BankController(BankModel model, BankViewer view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Method to initialize the controller
     * and add action listeners to buttons on all panels
     */
    public void initController() {

        // WelcomePanel \\
        // Implements the ActionListener on the Login Button
        view.getWelcomePanel().getLoginButton().addActionListener(
            (e) -> {
                if(!view.getWelcomePanel().getUserText().getText().equals(""))
                {
                    // store username
                    this.username = view.getWelcomePanel().getUserText().getText();
                    this.password = String.valueOf(view.getWelcomePanel().getPassText().getPassword());

                    // Username validation
                    if(model.findAccount(this.username) >= 0)
                    {
                        // Password validation
                        if(model.authenticate(this.username, this.password)) {
                            // set balance label on account panel
                            view.getAccountPanel().getAmountLabel().setText(
                                String.valueOf(model.getAccountModel(model.findAccount(this.username)).getBalance())
                            );
                            // change to account panel
                            view.changeCard(view.getWelcomePanel().getContainer(), "AccountPanel");
                            // clear welcome panel
                            view.getWelcomePanel().clearPanel();
                        } else {
                            System.out.println("Incorrect password.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                } else {
                    System.out.println("The username cannot be blank.");
                }     
            });
        
        // Implements the ActionListener on the Account Creation Button
        view.getWelcomePanel().getCreateAccountButton().addActionListener(
            (e) -> view.changeCard(view.getWelcomePanel().getContainer(), "CreateAccount")
        );

        // CreateAccountPanel \\
        // Implements the ActionListener on the back button
        view.getCreateAccountPanel().getBackButton().addActionListener(
            (e) -> {
                view.getCreateAccountPanel().clearPanel();
                view.changeCard(view.getCreateAccountPanel().getContainer(), "Welcome");
            });
        
        // Implements the ActionListener on the account creation button
        view.getCreateAccountPanel().getCreateAccountButton().addActionListener(
            (e) -> {
                // Store user input
                String createUsername = view.getCreateAccountPanel().getUserText().getText();
                char[] passArray = view.getCreateAccountPanel().getPassText().getPassword();
                String createPassword = String.valueOf(passArray);
                char[] confirmPassArray = view.getCreateAccountPanel().getConfirmPassText().getPassword();
                String confirmPassword = String.valueOf(confirmPassArray);
                // Input validation to ensure passwords match
                if(createPassword.equals(confirmPassword)) {
                    // create a new Account object with user input
                    model.addAccount(new AccountModel(createUsername, createPassword, 0));
                    // Clear fields
                    view.getCreateAccountPanel().clearPanel();
                    // Change card back to welcome panel
                    view.changeCard(view.getCreateAccountPanel().getContainer(), "Welcome");
                } else {
                    System.out.println("The passwords do not match.");
                }
            });

        // AccountPanel \\
        // Implements the ActionListener on the logout button
        view.getAccountPanel().getLogoutButton().addActionListener(
            (e) -> {
                view.getAccountPanel().clearPanel();
                view.changeCard(view.getAccountPanel().getContainer(), "Welcome");
            });
        
        // Implements the ActionListener on the deposit button
        view.getAccountPanel().getDepositButton().addActionListener(
            (e) -> {
                view.getAccountPanel().removeWithdrawOption();
                view.getAccountPanel().addDepositOption();
            });
        
        // Implements the ActionListener on the withdraw button
        view.getAccountPanel().getWithdrawButton().addActionListener(
            (e) -> {
                view.getAccountPanel().removeDepositOption();
                view.getAccountPanel().addWithdrawOption();
            });

        // Implements the ActionListener on the cancel button
        view.getAccountPanel().getCancelButton().addActionListener(
            (e) -> {
                view.getAccountPanel().clearPanel();
            });

        // Implements the ActionListener on the confirmation button
        view.getAccountPanel().getConfirmButton().addActionListener(
            (e) -> {
                // If deposit, else withdraw
                if(view.getAccountPanel().isDepositOrWithdraw()) {
                    model.getAccountModel(model.findAccount(this.username))
                        .deposit(Double.parseDouble(view.getAccountPanel().getDepositAmountText().getText()));
                    view.getAccountPanel().getAmountLabel().setText(
                        String.valueOf(model.getAccountModel(model.findAccount(this.username)).getBalance())
                    );
                } else {
                    model.getAccountModel(model.findAccount(this.username))
                        .withdraw(Double.parseDouble(view.getAccountPanel().getWithdrawAmountText().getText()));
                    view.getAccountPanel().getAmountLabel().setText(
                        String.valueOf(model.getAccountModel(model.findAccount(this.username)).getBalance())
                    );
                }
                view.getAccountPanel().clearPanel();
            });
    } // End of initController
}
