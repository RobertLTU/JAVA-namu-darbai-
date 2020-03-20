package biggerLearningProjects;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BaseHamburger baseHamburger = new BaseHamburger("Base", "Beef", 3.00);
        baseHamburger.currentPrice();
        baseHamburger.addIngredients(true,false,true, false);
        baseHamburger.currentPrice();

        HealthyBurger healthyBurger = new HealthyBurger(4.55);
        healthyBurger.addIngredients(false,true,false,true,true,true);
        healthyBurger.currentPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe",6.99);
    }

}

/* Bills Burgers - Create an Application for selling hamburgers
Select Type of Burger + additional items with a certain price increase
BASE hamburger CLASS + other types that would inherit
BASIC hamburger consist of: bread roll type, meat + EXTRA ADDITIONS : lettuce, tomato, carrot, pickle
1. Create a class of BASE hamburger
 */
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.

// Also create two extra varieties of Hamburgers (subclasses) to cater for

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.

//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.
