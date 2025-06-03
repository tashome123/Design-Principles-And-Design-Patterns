package Interface_Segregation.Fails;

public class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot working...");
    }
}

