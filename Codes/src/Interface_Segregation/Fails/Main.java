package Interface_Segregation.Fails;

import Interface_Segregation.Shows.Eatable;
import Interface_Segregation.Shows.Sleepable;
import Interface_Segregation.Shows.Workable;

public class Main {
    public static void main(String[] args) {
        Workable human = new Workable() {
            @Override
            public void work() {

            }
        };
        Workable robot = new RobotWorker();

        human.work();
        robot.work();

        Eatable eater = new Eatable() {
            @Override
            public void eat() {

            }
        };
        eater.eat();

        Sleepable sleeper = new Sleepable() {
            @Override
            public void sleep() {

            }
        };
        sleeper.sleep();
    }
}

