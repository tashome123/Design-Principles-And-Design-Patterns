package Interface_Segregation.Shows;

public class Main {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        Workable robot = new RobotWorker();

        human.work();
        robot.work();

        Eatable eater = new HumanWorker();
        eater.eat();

        Sleepable sleeper = new HumanWorker();
        sleeper.sleep();
    }
}
