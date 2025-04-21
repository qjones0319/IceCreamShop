//Class for regulating the shop with inventory and orders

import java.util.ArrayList;
import java.util.List;

public class ShopDetails {

    private Inventory inventory;
    private List<Order> completeOrders;

    public ShopDetails() {
        this.inventory = new Inventory();
        this.completeOrders = new ArrayList<>();
    }

    public Inventory getInventory() {
        return inventory;
    }
    
    public boolean isOrderProccessed(Order order) { //Check if the inventory has enough for the order
        boolean processed = order.isAvailable(inventory);
        if (processed == true) {
            completeOrders.add(order);
        }
        return processed;
    }

    public double getTotal() {
        double total = 0;
        for (Order order : completeOrders) {
            total += order.getTotal();
        }
        return total;
    }

    public List<Order> getCompleteOrders() {
        return completeOrders;
    }
}