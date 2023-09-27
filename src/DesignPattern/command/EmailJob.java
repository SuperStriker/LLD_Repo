package DesignPattern.command;

public class EmailJob implements Job{

    private email e_Email;

    @Override
    public void run() {
        if(e_Email != null){
            this.sendEmail();
        }        
    }

    private void sendEmail() {
    }
    
    

}
