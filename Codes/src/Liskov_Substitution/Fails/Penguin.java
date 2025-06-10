package Liskov_Substitution.Fails;

import Liskov_Substitution.Shows.Bird;

public abstract class Penguin extends Bird {
    @Override
    public void fly() {
        // Penguins can't fly
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
