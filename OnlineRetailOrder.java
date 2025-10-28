// Multilevel Inheritance: Online Retail Order Management
class Order {
    int orderId;
    String orderDate;

    void getOrderStatus() {
        System.out.println("Order placed on: " + orderDate);
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Order shipped. Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Order delivered on: " + deliveryDate);
    }
}

public class OnlineRetailOrder {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.orderId = 101;
        d.orderDate = "2025-10-25";
        d.trackingNumber = "TRK12345";
        d.deliveryDate = "2025-10-27";
        d.getOrderStatus();
    }
}
