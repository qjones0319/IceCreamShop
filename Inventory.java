import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<IceCream, Integer> checkIceScreamStock;
    private Map<Toppings, Integer> checkToppingsStock;

    public Inventory() { //HashMaps for storing IceCream and Toppings
        checkIceScreamStock = new HashMap<>();
        checkToppingsStock = new HashMap<>();
    }

    public void addIceCream(IceCream iceCream, int quantity) {  //Store IceCream and quantity in HashMap
        checkIceScreamStock.put(iceCream, checkIceScreamStock.getOrDefault(iceCream, 0) + quantity);
    }

    public void addToppings(Toppings toppings, int quantity) { //Store Toppings and quantity in HashMap
        checkToppingsStock.put(toppings, checkToppingsStock.getOrDefault(toppings, 0) + quantity);
    }

    public boolean IceCreamStock(IceCream iceCream) { //Check if available IceCream
        int count = checkIceScreamStock.getOrDefault(iceCream, 0);
        if(count > 0) {
            checkIceScreamStock.put(iceCream, count - 1);
            return true;
        }
        return false;
    }

    public boolean ToppingsStock(Toppings toppings) { //Check if available Toppings
        int count = checkToppingsStock.getOrDefault(toppings, 0);
        if(count > 0) {
            checkToppingsStock.put(toppings, count - 1);
            return true;
        }
        return false;
    }

    public int getIceCreamStock(IceCream iceCream) {
        return checkIceScreamStock.getOrDefault(iceCream, 0);
    }

    public int getToppingsStock(Toppings toppings) {
        return checkToppingsStock.getOrDefault(toppings, 0);
    }
}
