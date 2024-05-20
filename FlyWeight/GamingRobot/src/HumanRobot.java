public class HumanRobot implements IRobot{

    private String type;
    private Sprite body;

    HumanRobot(String type, Sprite body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("humanoid robot is displayed at " + String.valueOf(x) + " " + String.valueOf(y));
    }
}
