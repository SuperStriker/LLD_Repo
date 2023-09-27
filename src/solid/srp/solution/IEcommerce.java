package solid.srp.solution;

public interface IEcommerce {

    void addItemtoCart();

    void deleteItemfromCart();

    void updateItemtoCart();

    String CreateOrder();

    void deleteOrder(final String orderId);

    void trackOrderShipments(final String orderId);

    void makePaymentforOrder(final String orderId);

    void createUserAccount();

    void forgetPassword();
    
    void loginUserAccount();

    void resetPassword();

    
}
