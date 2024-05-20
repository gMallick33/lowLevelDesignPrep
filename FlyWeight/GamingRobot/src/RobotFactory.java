import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, IRobot> robotCache = new HashMap<>();
    public static IRobot createRobot(String robotType) {
        if(robotCache.containsKey(robotType)) {
            return robotCache.get(robotType);
        }
        else {
            if(robotType.equals("HUMAN")) {
                IRobot humanRobot = new HumanRobot(robotType, new HumanSprite());
                robotCache.put(robotType, humanRobot);
                return humanRobot;
            }
            else if(robotType.equals("DOG")) {
                IRobot dogRobot = new DogRobot(robotType, new DogSprite());
                robotCache.put(robotType, dogRobot);
                return dogRobot;
            }
        }
        return null;

    }
}
