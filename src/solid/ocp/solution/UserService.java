package solid.ocp.solution;


public class UserService implements IUserService {

    IEmailService emailService;

    // UserService userService = new UserService(new GoogleEmailService());
    // UserService userService = new UserService(new MicrosoftEmailService());

    public UserService(IEmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void createUserAccount() {
        this.emailService.sendEmail("ravi@email.com", "created account");
        // have definition
    }

    @Override
    public void loginUserAccount() {
        // have definition
    }

    @Override
    public void forgetPassword() {
        // have definition
        this.emailService.sendEmail("ravi@email.com", "forgot password");
    }

    @Override
    public void resetPassword() {
        // have definition
        this.emailService.sendEmail("ravi@email.com", "you successuly reset your password");
    }
}
