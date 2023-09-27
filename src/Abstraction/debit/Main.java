package Abstraction.debit;

import Abstraction.shape.WellsFargoDebitCard;

public class Main {
    

    public static void main(String[] args){
        DebitCard dc = new USBankDebitCard();
        dc.withdrawamount(5);

        DebitCard dc1 = new WellsFargoDebitCard();
        System.out.println("dc withdraw:" + dc1.withdrawamount(7));
    }
}
