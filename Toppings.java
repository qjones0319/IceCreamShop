//Class for getting and setting the toppings and printing out the cost associated with it as well

public class Toppings {

    private String name;
    private double cost;

    public Toppings(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Topping: " + name + " Cost: " + cost;
    }
}