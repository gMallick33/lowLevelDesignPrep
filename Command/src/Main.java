public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.setCommand(new CommandTurnOn(new AC()));
        remote.pressButton();
        remote.undo();
    }
}