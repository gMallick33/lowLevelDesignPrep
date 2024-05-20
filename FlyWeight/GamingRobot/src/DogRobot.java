public class DogRobot implements IRobot{

    String type;
    Sprite body;
    DogRobot(String type, Sprite body) {
        this.type = type;
        this.body = body;
    }
    @Override
    public void display(int x, int y) {
        System.out.println("dog robot is displayed at " + String.valueOf(x) + " " + String.valueOf(y));
    }
}
