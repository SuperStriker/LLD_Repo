package DesignPattern.command;

public class EmailJob implements Job{

    private Email e_Email;

    @Override
    public void run() {
        if(e_Email != null){
            e_Email.sendEmail();
        }        
    }

   
    public void setEmail(Email email) {
        this.e_Email = email;
    }
    
    

}
