package Liskov_Substitution.Shows;

public class Main {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();
        sparrow.makeSound();

        Bird penguin = new Penguin();
        penguin.makeSound();


    }
}
