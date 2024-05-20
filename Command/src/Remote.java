import java.util.Stack;

public class Remote {
    Stack<Command> commandStack = new Stack<>();
    Command command;

    public void setCommand(Command com) {
        command = com;
    }
    public void pressButton() {
        command.execute();
        commandStack.push(command);
    }
    public void undo() {
        if(!commandStack.empty()) {
            Command command = commandStack.peek();
            commandStack.pop();
            command.undo();
        }
    }
}
