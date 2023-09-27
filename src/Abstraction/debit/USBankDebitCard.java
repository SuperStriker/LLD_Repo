package Abstraction.debit;

public class USBankDebitCard extends DebitCard{

    @Override
    public int withdrawamount(int amount) {
        // TODO Auto-generated method stub
        System.out.println("withdraw amount :" + (int)(amount+10));
        return amount+10;
    }
    


}
