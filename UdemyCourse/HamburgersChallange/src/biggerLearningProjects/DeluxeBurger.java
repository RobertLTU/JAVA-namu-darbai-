package biggerLearningProjects;

    public class DeluxeBurger extends BaseHamburger {
        int chips = 1;
        int drinks = 1;

    public DeluxeBurger(String meat, double basePrice) {
        super("Deluxe", meat, basePrice);

    }
        public void addIngredients(boolean letuce, boolean tomato, boolean carrot, boolean pickle) {
            System.out.println("Cannot add any Extra ingredients to the Deluxe Burger!");
        }
}

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.