package Interface_Segregation.Shows;

public class HumanWorker implements Workable, Eatable, Sleepable {
    public void work() {
        System.out.println("Human working...");
    }

    public void eat() {
        System.out.println("Human eating...");
    }

    public void sleep() {
        System.out.println("Human sleeping...");
    }
}
