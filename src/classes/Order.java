package classes;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderMaterial> order;

    public Order(ArrayList<OrderMaterial> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order=" + order +
                '}';
    }

    public ArrayList<OrderMaterial> getOrder() {
        return order;
    }
}
