package Liskov_Substitution.Fails;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow() {
            @Override
            public void makeSound() {

            }
        };
        Penguin penguin = new Penguin() {
            @Override
            public void makeSound() {

            }
        };

        sparrow.fly();
        penguin.fly();
    }
}
