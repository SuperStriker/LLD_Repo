package Abstraction.debit;

 abstract public class DebitCard {

    private String owner;
    private Long Id;
    private String password;
    public boolean isActive;


    public abstract int withdrawamount(int amount);
    public boolean isActive(){
        System.out.println("is active method");
        return isActive;
    }
    
    
}
