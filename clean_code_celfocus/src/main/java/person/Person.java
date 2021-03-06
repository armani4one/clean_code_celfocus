package person;

/**
 * This is a Person interface, it defines the general characteristics of a Human being in this context
 */
public interface Person {

    int minimumAge = 18;
    int getAge();
    String getName();
    boolean canBuyACar();

    // the intent was to create a function to check if the customer has minimun age to checkout
    default boolean hasMinimunAgeToBuyACar(Person p) {
        return 18 < p.getAge();
    }
}
