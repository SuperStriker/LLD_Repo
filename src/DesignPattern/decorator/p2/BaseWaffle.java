package DesignPattern.decorator.p2;

public abstract class BaseWaffle {
    
    private int price;
    private String description;

    public BaseWaffle(int price, String description) {
        this.price = price;
        this.description = description;
    }

    BaseWaffle(){

    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
