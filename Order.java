//Class for storing the orders of the customers based on the iceCream and toppings.

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Customer customer;
    private List<IceCream> orderedIceCream;
    private List<Toppings> orderedToppings;
    

    public Order(Customer customer) {
        this.customer = customer;
        this.orderedIceCream = new ArrayList<>();
        this.orderedToppings = new ArrayList<>();
        
    }

    public void addIceCream(IceCream iceCream) { //Adding IceCream to Order
        orderedIceCream.add(iceCream);
    }

    public void addToppings(Toppings toppings) { //Adding Toppings to Order
        orderedToppings.add(toppings);
    }

    public boolean isAvailable(Inventory inventory) { //Check if theres enough IceCream and Toppings for the customer order
        for (IceCream iceCream : orderedIceCream) {
            if (!inventory.IceCreamStock(iceCream)) {
                return false;
            }
        }
        for (Toppings toppings : orderedToppings) {
            if (!inventory.ToppingsStock(toppings)) {
                return false;
            }
        }
        return true;
    }

    public double getTotal() { //Calculating the total cost for toppings and ice cream
        double total = 0;
        for (IceCream iceCream : orderedIceCream) {
            total += iceCream.getCost();
        }
        for (Toppings toppings : orderedToppings) {
            total += toppings.getCost();
        }
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List <IceCream> getOrderedIceCream() {
        return orderedIceCream;
    }

    public List <Toppings> getOrderedToppings() {
        return orderedToppings;
    }

}