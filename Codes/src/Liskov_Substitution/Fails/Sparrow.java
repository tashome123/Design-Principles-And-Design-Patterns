package Liskov_Substitution.Fails;

import Liskov_Substitution.Shows.Bird;

public class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
