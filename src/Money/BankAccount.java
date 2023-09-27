package Money;

public class BankAccount {
    
    private Long accountno;
    private Long balance;
    private String accountholdername;
    private String accountType;
    private String branchid;
    private Integer age;

    public BankAccount(String accountholdername, String accountType,Long accountno,Long balance,Integer age) throws Exception{
        if(age < 10){
            throw new Exception("Min age is 10", null);
        }
        this.accountholdername = accountholdername;
        this.accountType = accountType;
    }
    

    public Long getAccountno() {
        return accountno;
    }


    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }


    public void withdrawamount(Long amount){
        this.balance = this.balance - amount;
    }

    
    public void add_balance(Long amount){
        this.balance = this.balance + amount;
    }

    
    private void calculateQuarterlyinterest(){
        this.balance = this.balance + 100L;
    }

    public Long check_balance(){
        return this.balance;
    }




}
