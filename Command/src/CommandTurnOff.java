public class CommandTurnOff implements Command{
    AC ac;
    CommandTurnOff(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    public void undo() {
        ac.turnOnAC();
    }
}
