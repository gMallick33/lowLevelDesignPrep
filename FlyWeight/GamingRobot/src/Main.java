public class Main {
    public static void main(String[] args) {
        IRobot humanRobot = RobotFactory.createRobot("HUMAN");
        IRobot dogRobot = RobotFactory.createRobot("DOG");
        humanRobot.display(4, 5);
        dogRobot.display(14, 15);
    }
}