package DesignPattern.command;

public class SMSJob implements Job{
    private sms sms;

    public void setSms(sms sms) {
        this.sms = sms;
    }
    @Override
    public void run() {
        if(sms != null) {
            sms.sendsms();
        }
    }
}
