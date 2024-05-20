public class CommandTurnOn implements Command{
    AC ac;
    CommandTurnOn(AC ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }
    public void undo() {
        ac.turnOffAC();
    }
}
