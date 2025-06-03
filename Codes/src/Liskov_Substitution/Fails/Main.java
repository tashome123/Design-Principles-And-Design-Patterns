package Liskov_Substitution.Fails;

import Liskov_Substitution.Shows.Bird;

public class Main {
    public static void main(String[] args) {
        Liskov_Substitution.Shows.Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.fly();
        penguin.fly();
    }
}
