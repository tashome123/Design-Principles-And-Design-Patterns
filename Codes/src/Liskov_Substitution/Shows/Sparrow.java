package Liskov_Substitution.Shows;

public class Sparrow extends FlyingBird {
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }
}
