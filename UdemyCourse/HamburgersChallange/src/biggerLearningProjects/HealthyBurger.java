package biggerLearningProjects;

public class HealthyBurger extends BaseHamburger{
    private double brokoliPrice = 0.35;
    private double avokadoPrice = 0.40;
    private int brokoli = 0;
    private int avokado = 0;

    public HealthyBurger(double basePrice){
        super("Healthy","Turkey", basePrice);
    }

    public void addIngredients(boolean letuce, boolean tomato, boolean carrot, boolean pickle, boolean brokoli, boolean avokado) {
        super.addIngredients(letuce, tomato, carrot, pickle);
        this.brokoli = brokoli ? 1 : 0;
        this.avokado = avokado ? 1 : 0;
    }
    public void currentPrice() {
        double currentPrice = this.getBasePrice() + this.getLetucePrice() * this.getLetuce() + this.getTomatoPrice() * this.getTomato() + this.getCarrotPrice() * this.getCarrotPrice() + this.getPicklePrice() * this.getPickle() + brokoliPrice * brokoli + avokado * avokadoPrice;
        if (this.getLetuce() + this.getTomato() + this.getCarrot() + this.getPickle() + brokoli + avokado == 0) {
            System.out.println("TOTAL price of Healthy Hamburger without additions : " + currentPrice + " EUR");
        } else {
            System.out.println("TOTAL price of Healthy Hamburger: " + currentPrice + " EUR" +  " of which: " + "\n" +
                    "Base Healthy Burger price: " + this.getBasePrice() + " EUR");
            if (this.getLetuce() == 1) System.out.println("added letuce price: " + this.getLetucePrice() * this.getLetuce() + " EUR");
            if (this.getTomato() == 1) System.out.println("added tomato price: " + this.getTomatoPrice() * this.getTomato() + " EUR");
            if (this.getCarrot() == 1) System.out.println("added carrot price: " + this.getCarrotPrice()  * this.getCarrot()  + " EUR");
            if (this.getPickle() == 1) System.out.println("added letuce price: " + this.getPicklePrice() * this.getPickle() + " EUR");
            if (brokoli == 1) System.out.println("added brokoli price: " + brokoliPrice * brokoli + " EUR");
            if (avokado == 1) System.out.println("added avokado price: " + avokadoPrice * avokado + " EUR");
        }
    }

}

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).