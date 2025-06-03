package Liskov_Substitution.Shows;

public class Penguin extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Honk honk!");
    }

    public void swim() {
        System.out.println("Penguin swimming...");
    }
}
