public class HumanWorker implements Worker {
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

public class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot working...");
    }

    public void eat() {
        // Not applicable for robots!
    }

    public void sleep() {
        // Not applicable for robots!
    }
}
