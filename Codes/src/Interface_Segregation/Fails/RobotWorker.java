package Interface_Segregation.Fails;

import Interface_Segregation.Shows.Workable;

public class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot working...");
    }
}

