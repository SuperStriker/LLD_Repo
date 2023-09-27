package Abstraction.shape;

import Abstraction.debit.DebitCard;

public class WellsFargoDebitCard extends DebitCard{

    @Override
    public int withdrawamount(int amount) {
        // TODO Auto-generated method stub
        return 10;
    }
    @Override
    public boolean isActive(){
        System.out.println("is active method override");
        return isActive;
    }
}
