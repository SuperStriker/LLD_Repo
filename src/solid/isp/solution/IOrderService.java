package solid.isp.solution;

public interface IOrderService {
    
    String CreateOrder();

    void deleteOrder(final String orderId);

    void trackOrderShipments(final String orderId);

}
