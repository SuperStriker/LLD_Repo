package DesignPattern.singleton;

public class YahooEmailSerivce implements IEmailService {

    private static YahooEmailSerivce yserviceinstance;
    private String serviceInstanceName;

    private YahooEmailSerivce(String serviceInstanceName){
        this.serviceInstanceName = serviceInstanceName;
    }
    
      private YahooEmailSerivce(){
    }

    // private YahooEmailSerivce(){

    // }

    public static YahooEmailSerivce getEmailSerivce(String serviceInstanceName){
        // if(serviceInstanceName == null){
        //     yserviceinstance = new YahooEmailSerivce(serviceInstanceName);
        // }
         if(yserviceinstance == null){
            yserviceinstance = new YahooEmailSerivce();
        }
        
        return yserviceinstance;
    }

    @Override
    public void sendEmail(String emailId, String emailContent) {
        // TODO Auto-generated method stub
        
    }
    
}
