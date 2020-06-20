public class Drink {
    private String name;
    private double price;
    private boolean alcoholFree;

    public Drink(String name, double price, boolean alcoholFree) {
        this.name = name;
        this.price = price;
        this.alcoholFree = alcoholFree;
    }

    boolean isAlcoholFree(){
        return alcoholFree;
    }

    double getPrice() {
        return price;
    }
}
