//Class for getting and setting the ice cream and cost and printing it out

public class IceCream {

    private String flavor;
    private double cost;

    public IceCream(String flavor, double cost) { //Constructor for Ice Cream and Cost
        this.flavor = flavor;
        this.cost = cost;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getCost() {
        return cost;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() { //Printing the Ice Cream and Cost
        return "Flavor: " + flavor + " Cost: " + cost;
    }
}