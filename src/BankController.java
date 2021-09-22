
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
            e -> view.changeCard(view.getWelcomePanel().getContainer(), "AccountPanel")
        );

        view.getWelcomePanel().getCreateAccountButton().addActionListener(
            e -> view.changeCard(view.getWelcomePanel().getContainer(), "CreateAccount")
        );

        // CreateAccountPanel
        view.getCreateAccountPanel(); // TODO finish adding action listeners after finishing todo's in CreateAccountPanel
    }
}
