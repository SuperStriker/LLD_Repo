package DesignPattern.decorator.p1;

public abstract class BaseWaffle {
    
    private int price;
    private String description;

    public BaseWaffle(int price, String description) {
        this.price = price;
        this.description = description;
    }

    BaseWaffle(){

    }
}
