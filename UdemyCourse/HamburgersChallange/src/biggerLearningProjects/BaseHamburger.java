package biggerLearningProjects;

import java.sql.SQLOutput;

public class BaseHamburger {
    private String name; // Base, Healthy, Deluxe.
    private String meat; // Beef, Turkey, Chicken.
    private Double basePrice;
    private String breadRollType; // light, brown , dark, marbled (available types of bread Roll rye).

    private double priceTotal;
    private int letuce = 0;
    private int tomato = 0;
    private int carrot = 0;
    private int pickle = 0;
    private double letucePrice = 0.15;
    private double tomatoPrice = 0.25;
    private double carrotPrice = 0.20;
    private double picklePrice = 0.25;

    public BaseHamburger(String name, String meat, Double basePrice) {
        this.name = name;
        this.meat = meat;
        this.basePrice = basePrice;

    }

    public void addIngredients(boolean letuce, boolean tomato, boolean carrot, boolean pickle) {
        this.letuce = letuce == true ? 1 : 0;
        this.tomato = tomato == true ? 1 : 0;
        this.carrot = carrot == true ? 1 : 0;
        this.pickle = pickle == true ? 1 : 0;
    }

    public void currentPrice() {
        double currentPrice = basePrice + letucePrice * letuce + tomatoPrice * tomato + carrotPrice * carrot + picklePrice * pickle;
        if (letuce + tomato + carrot + pickle == 0) {
            System.out.println("TOTAL price of base hamburger without additions : " + currentPrice + " EUR");
        } else {
            System.out.println("TOTAL price: " + currentPrice + " of which: " + "\n" +
                    "Base hamburger price: " + basePrice + " EUR");
            if (letuce == 1) System.out.println("added letuce price: " + letucePrice * letuce + " EUR");
            if (tomato == 1) System.out.println("added tomato price: " + tomatoPrice * tomato + " EUR");
            if (carrot == 1) System.out.println("added carrot price: " + carrotPrice * carrot + " EUR");
            if (pickle == 1) System.out.println("added pickle price: " + picklePrice * pickle + " EUR");
        }
    }
    //======= GETTERS AND SETTERS ================

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public int getLetuce() {
        return letuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getPickle() {
        return pickle;
    }

    public double getLetucePrice() {
        return letucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getPicklePrice() {
        return picklePrice;
    }
}


